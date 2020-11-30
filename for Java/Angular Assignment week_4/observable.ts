/*----------------------------------------------------------------------app.component.html-------------------------------------*/
<div class="container">
  <h2>By removing the banned currency this are the valid currency</h2>
  <ul>
    <li *ngFor="let product of currencies">
      {{product.name}} 
    </li>
  </ul>


  <br>

  <div class="my-3">
    <h2>Transaction details</h2>
    <br>
    <h5>Seraching transaction details</h5>
    <form #searchForm="ngForm">
      <div class="mt-3">
        <input type="text" required  name="searchTerm" ngModel class="form-control form-control-lg">
      </div>
    </form>
    <br>
    <hr>
   </div>

    <div class="results">
      <div class="d-flex">
        <h5>Search results</h5>
        <span class="ml-auto text-muted">{{count}} results found</span>
    </div>
    <table class="table">
         <thead>
           <tr>
             <th scope="col">S.No</th>
             <th scope="col">Customer-ID</th>
             <th scope="col">Transaction details</th>
             <th scope="col">Amount</th>
           </tr>
         </thead>
         <tbody>
                  <tr *ngFor="let item of SearchResults; index as i">
                          <th scope="row">{{i+1}}</th>
                          <td>{{item.Id}}</td>
                          <td>
                            <strong> Transaction-ID:{{item.Transaction_No}} </strong>
                            <p>{{item.To}}</p>
                          </td>
                          <td>Amonut:{{item.Amount}}</td>                    
                 </tr>
        </tbody>
    </table>
  </div>

  <br>

  <h2>By removing the Partially or incorrect submitted documents this are the valid docuements</h2>
  <ul>
    <li *ngFor="let d of doc">
      {{d.name}} 
    </li>
  </ul>

</div>
/*----------------------------------------------------------app.component.ts-------------------------------------------------*/

import { AfterViewInit, asNativeElements, Component, OnInit, ViewChild} from '@angular/core';
import {Validator,FormBuilder, FormGroup, Validators ,ReactiveFormsModule} from '@angular/forms';
import {ForexserviceService} from './forexservice.service';
import {PaymentPayLoadService} from './payment-pay-load.service';
import { FraudulentPaymentService } from './fraudulent-payment.service';
import {FormControl} from '@angular/forms';
import {NgForm} from '@angular/forms';

import {OneconversionService} from './oneconversion.service';

import {Pipe,PipeTransform} from '@angular/core'

import {filter,map,debounceTime,distinctUntilChanged, switchMap} from 'rxjs/operators';
import { Observable } from 'rxjs';
import { Currency } from './Currency';
import { search } from './search.interface';
import { documents} from './Docuements';




@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit,AfterViewInit
{

  
  currencies: any;
  SearchResults:search;
  count:number;
  doc:any

  constructor(private dataService: ForexserviceService) { }

  public curr :Observable<Currency[]>=null;
  public docc :Observable<documents[]>=null;

  ngOnInit() 
  {
    this.dataService.getcurrencies().pipe
    (
    map((data:Currency[])=>
    {
      let crr:Currency[]=[]
      data.map(d=>
        {
         if(d.name!='AAA' && d.name!='HHH') { crr.push(d) };
        }
      )
      return crr;
    }))
    .subscribe
    (
      (res:Currency[])=>
       {
         this.currencies=res;
       }
    )

    this.dataService.getdocuements().pipe
    (
    map((data:documents[])=>
    {
      let crr:documents[]=[]
      data.map(d=>
        {
         if(d.status!='Partially submitted' && d.status!='Incorrect') { crr.push(d) };
        }
      )
      return crr;
    }))
    .subscribe
    (
      (res:documents[])=>
       {
         this.doc=res;
       }
    )



    
   }

  @ViewChild('searchForm') searchForm:NgForm

  ngAfterViewInit():void
  {


      const formvalue=this.searchForm.valueChanges;  

      formvalue.
      pipe(filter(()=>this.searchForm.valid),map(data=>data.searchTerm),debounceTime(500),
              distinctUntilChanged(),switchMap(data=>this.dataService.getsearches(data))).
      subscribe(res=>{this.SearchResults=res; this.count=Object.keys(res).length})
  }

}
/*-------------------------------------------------------------observable.service.ts-----------------------------------*/

import { HttpClient,HttpClientModule } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, of, Subject } from 'rxjs';
import { search } from './search.interface';

@Injectable({
  providedIn: 'root'
})

export class ForexserviceService 
{

  constructor(private httpclient:HttpClient){}

   url='http://localhost:3000/Transactions';

   getsearches(searchTerm):Observable<search>
   {
       return this.httpclient.get<search>(this.url+'?q='+searchTerm);
   }

  getcurrencies() 
  {
    return this.httpclient.get('http://localhost:3000/Currencies')
  }

  getdocuements()
  {
    return this.httpclient.get('http://localhost:3000/docuements')
  }
}
/*----------------------------------------------------------Currency.ts---------------------------------------------*/
export class Currency
{
    name:string;
}
/*-----------------------------------------------------------search.ts----------------------------------------------*/
export interface search
{
    Id:string;
    Transaction_No:string;
    To:string;
    Amount:string;
}
/*----------------------------------------------------------docuements.ts--------------------------------------------*/
export class documents
{
    name:string;
    status:string;
}
/*---------------------------------------------------------------JSON.json------------------------------------------*/
{
    "Currencies":
    [
        {"name":"INR"},
        {"name":"GBP"},
        {"name":"NZD"},
        {"name":"USD"},
        {"name":"HHH"},
        {"name":"EUR"},
        {"name":"CAD"},
        {"name":"AUD"},
        {"name":"AAA"}
    ],

    "Transactions":
    [
        {
            "Id":"Srinivas Potturi",
            "Transaction_No":"TRN001223334",
            "To":"To the Citi bank for shopping purpose",
            "Amonut":"$1234"
        },
        {
            "Id":"Sivie",
            "Transaction_No":"TRN001223534",
            "To":"To the Chiui bank for shopping purpose",
            "Amonut":"$1234"
        },
        {
            "Id":"Heamnth",
            "Transaction_No":"TRN001220334",
            "To":"To the baroda bank for hdfc purpose",
            "Amonut":"$1234"
        },
        {
            "Id":"Heehiha prasad",
            "Transaction_No":"TRN001223334",
            "To":"To the Mrui bank for home loan purpose",
            "Amonut":"$1234"
        },
        {
            "Id":"venkatesh",
            "Transaction_No":"TRN001228904",
            "To":"To the jiuyi bank for loan purpose",
            "Amonut":"$123904"
        },
        {
            "Id":"Mehad",
            "Transaction_No":"TRN0012893334",
            "To":"To the hema bank for loan purpose",
            "Amonut":"$1234"
        },
        {
            "Id":"Sri Potturi",
            "Transaction_No":"TRN0019223334",
            "To":"To the cyma bank for home loan purpose",
            "Amonut":"$1234"
        },
        {
            "Id":"Ranjith meha",
            "Transaction_No":"TRN0012673334",
            "To":"To the higu bank for shopping purpose",
            "Amonut":"$19034"
        },
        {
            "Id":"Sriniu koyu",
            "Transaction_No":"TRN001923334",
            "To":"To the GIdI bank for cinema loan purpose",
            "Amonut":"$6784"
        },
        {
            "Id":"Harry Potter",
            "Transaction_No":"TRN001563334",
            "To":"To the mufi bank for loan of house purpose",
            "Amonut":"$67789"
        },
        {
            "Id":"Harish Mandela",
            "Transaction_No":"TRN001223334",
            "To":"To the Hiwai bank for House loan purpose",
            "Amonut":"$8904"
        },
        {
            "Id":"Heema Konidhi",
            "Transaction_No":"TRN001229034",
            "To":"To the ZERA bank for visa loan purpose",
            "Amonut":"$123478"
        },
        {
            "Id":"Meena Agarthala",
            "Transaction_No":"TRN001223904",
            "To":"To the MIF bank for student loan purpose",
            "Amonut":"$127834"
        },
        {
            "Id":"Jimmy cheyu",
            "Transaction_No":"TRN0012456334",
            "To":"To the Kia bank for loan purpose",
            "Amonut":"$123004"
        },
        {
            "Id":"Henny Kena",
            "Transaction_No":"TRN004563334",
            "To":"To the Mardhad bank for loan purpose",
            "Amonut":"$123400"
        },
        {
            "Id":"John Kenny",
            "Transaction_No":"TRN00128034",
            "To":"To the HDFC bank for building purpose",
            "Amonut":"$12304"
        },
        {
            "Id":"Jyothi ",
            "Transaction_No":"TRN004224334",
            "To":"To the SBI bank for soung purpose",
            "Amonut":"$123094"
        },
        {
            "Id":"Paul",
            "Transaction_No":"TRN001228934",
            "To":"To the hiuo bank for himing purpose",
            "Amonut":"$123400"
        }
    ],
    "docuements":
    [
        {
            "name":"John",
            "status":"submitted"
        },
        {
            "name":"Mark",
            "status":"submitted"
        },
        {
            "name":"Beny",
            "status":"Partially submitted"
        },
        {
            "name":"John",
            "status":"Incorrect"
        }
    ]
}
