/*---------------------------------app.component.html-----------------------------------------*/
<div class="container mt-5">    
        <table class="table">
            <tr>
                <th>ID</th>
                <th>Product</th>
                <th>Description</th>
                <th>Cost</th>
                <th>Even</th>
                <th>Odd</th>
            </tr>  
            <tr *ngFor="let person of persons;even as e;odd as o">
                <td>{{person.Id}}</td>
                <td>{{person.Product}}</td>
                <td>{{person.Description}}</td>
                <td>{{person.Cost}}</td>
                <td>{{e}}</td>
                <td>{{o}}</td>
            </tr>
        </table>
    <div class="row">
      <div class="col">
        <input type="number" class="form-control" placeholder="Id" [(ngModel)]="Id">
      </div>
      <div class="col">
        <input type="text" class="form-control" placeholder="Product Name" [(ngModel)]="Product">
      </div>
      <div class="col">
        <input type="text" class="form-control" placeholder="Description" [(ngModel)]="Description">
      </div>
      <div class="col">
        <input type="text" class="form-control" placeholder="Cost" [(ngModel)]="Cost">
      </div>
      <div class="col">
        <button class="btn btn-primary btn-block" (click)="add(Id,Product,Description,Cost)">Add</button>
      </div>
    </div>
  
  </div>
/*---------------------------------app.component.ts-------------------------------------------*/

import { Component} from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent 
{
  title = 'angularAssignment1';
  persons = [

  ];
 
  Id:number;
  Product: String;
  Description:String;
  Cost:String;
  
  add(Id,Product,Description,Cost){
    this.persons.push({
      "Id":Id,
      "Product": Product,
      "Description":Description,
      "Cost":Cost
      
    });

    // resetting the input field
   
    this.Id = undefined;
    this.Product = "";
    this.Description="";
    this.Cost="";
  }
    
}
