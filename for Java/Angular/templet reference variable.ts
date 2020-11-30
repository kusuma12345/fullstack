/*----------------------------app.component.html---------------------------------*/
<h3>Develop a Angular project that uses template reference variable for text box, text area and select drop down control</h3>
<div class="container">
    <div>
        <select #select [(ngModel)]="selectedcity" (change)="log(select.value)">
            <option *ngFor="let city of cities" [value]="city.id">{{city.name}}</option>
        </select>
    </div>
    <br>
    <div>
        <button (click)="Str=''">Clear</button>
    </div>

    {{Str}}
</div>
/*----------------------------app.component.ts-----------------------------------*/
import { stringify } from '@angular/compiler/src/util';
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angularAssignment1';
  selectedcity:number=0;

  public cities:any=[
    {
      id:1,
      name:'Chennai',
      state:'TN'
    },
    {
      id:2,
      name:'Hyderabad',
      state:'TS'
    },
    {
      id:3,
      name:'Vizag',
      state:'AP'
    }
  ];
  Str:String=''
  log(id:number)
  {
    for(var v of this.cities)
    {
      if(v.id===+id)
      {
          this.Str=`You have selected ${v.state} state`;
      }
    }
   }
    
  }



/*----------------------------app.module.ts--------------------------------------*/
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';


@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }