/*---------------------------------------app.component.html--------------------------------------*/
<h3>Develop a Angular Project that show cases the following Event binding :- 
    a) Text Box’s key entry 
    c) Text Box Key Enter 
    d) Text Area Keyup +Shift +A 
    b) Button on Click</h3>
<div class="container">
     <!-- Text Box's key entry -->
     <div>
         <input (keyup)="onkey($event)"/>
         <br>
         <p>This is box key entry value is {{name}}</p>
     </div>

     <!-- Text Box key enter -->
     <div>
        <input #box (keyup.enter)="onenter(box.value)"/>
        <br>
        <p>This is box key enter value is {{value}}</p>
     </div> 
     
     <!-- Text area keyup + shift + A -->
     <div>
        <input #box1 (keydown.Shift.A)="onenter1(box1.value)"/>
        <br>
        <p>This is box keyup+shift+a is {{val}}</p>
     </div>

     <!-- Button on click -->
     <div>
         <button (click)="Hit()">Submit</button>
         <p>{{User}}</p>
     </div>
</div>

/*---------------------------------------app.component.ts----------------------------------------*/
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angularAssignment1';
  name:any='';
  onkey(event:any){
    this.name=event.target.value;
  }

  value:any='';
  onenter(value:string){
    this.value=value;
  }
  
  val:any='';
  onenter1(key:string){
    this.val=key;
  }

  User:any;
  Hit(){
    this.User='This is button click event';
  }
}

/*---------------------------------------app.module.ts-------------------------------------------*/
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