/*--------------------------------app.component.html---------------------------------------------------------------*/
<h3>1.Develop a Angular Project that show cases One way and two way data binding (Property binding and Event Binding).</h3>
<div class="container">
    <!-- One way data binding -->
    <div>
        <p>Good morning to one and all.Iam {{name}}</p> 
    </div>
   
    <!-- Two way data binding -->
    <div>
        <label>Username:</label>
        <input [(ngModel)]="Firstname"/>
    </div>
    
    
    <!-- Event binding -->
    <div>
        <button (click)="read(Firstname)">Submit</button>
    </div>
    
    <!-- Property binding -->
    <div>
        <p>This is a lion image</p>
        <img [src]="url" alt="" widht="500" height="300">
    </div>
</div>

/*-----------------------------------app.component.ts-------------------------------------------------------------*/

import { Component } from '@angular/core';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angularAssignment1';
  name:String="Srinivas";
  Firstname:String="";
  url='https://upload.wikimedia.org/wikipedia/commons/7/73/Lion_waiting_in_Namibia.jpg'

  read(username:String){
      alert(`${username} you have clicked the submit button`);
  }
}

/*--------------------------------------------app.module.ts---------------------------------------------*/
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

