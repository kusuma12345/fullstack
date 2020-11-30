/*----------------------------------------app.component.html------------------------------*/
<div class="container p-20">
  <h3>Please select the country:</h3>
  <select  [(ngModel)]="k">
    <option *ngFor="let cnt of countries" [value]="cnt.Id">{{cnt.Country}}</option>
  </select>
</div>
<br>
<div class="container">
  <div [ngSwitch]="k">
    <div *ngSwitchCase="1">
      <div class="container">
        <div>
          <label>Enter the name:</label>
          <input type="text" class="form-control" placeholder="Username">
        </div>
        <div>
          <label>Enter the Aadhar number:</label>
          <input type="text" class="form-control" placeholder="Aadhar">
        </div>
      </div>
    </div>
    <div *ngSwitchCase="2">
      <div class="container">
        <div>
          <label>Enter the SSN number:</label>
          <input type="number" class="form-control" placeholder="SSN number">
        </div>
        <div>
          <label>Enter the passport number:</label>
          <input type="number" class="form-control" placeholder="Passprt number">
        </div>
      </div>
    </div>
    <div *ngSwitchCase="3">
      <div class="container">
        <div>
          <label>Enter the Password:</label>
          <input type="password" class="form-control" placeholder="Password">
        </div>
    </div>
</div>
</div>
/*-----------------------------------------------------------app.component.ts--------------------------------------------------------------*/

import { Component} from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent 
{
  title = 'angularAssignment1';
  k:number=0
  countries=[
    {Id:1,Country:"India"},
    {Id:2,Country:"US"},
    {Id:3,Country:"UK"},

]
      
}
