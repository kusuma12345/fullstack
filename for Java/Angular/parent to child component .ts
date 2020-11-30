/*------------------------------------------app.component.html----------------------------------------*/
<div class="container p-2">
    <app-child *ngFor="let user of Users" [value1]="user.fname"></app-child>
</div>
/*------------------------------------------app.component.ts------------------------------------------*/
import { Component} from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent
{
  title = 'angularAssignment1';
  
  Users=[
    {id:1,fname:"John"},
    {id:2,fname:"Keny"},
    {id:2,fname:"Mary"}
  ];
  
}
/*------------------------------------------child.component.html--------------------------------------*/
<p>The selected city is {{value1}}</p>
/*------------------------------------------child.component.ts----------------------------------------*/
import { Component, Input, OnInit} from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})

export class ChildComponent implements OnInit {

  constructor() { }

  @Input()
  public value1:String;

  ngOnInit(): void {
  }

}

/*------------------------------------------app.module.ts---------------------------------------------*/
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ChildComponent } from './child/child.component';


@NgModule({
  declarations: [
    AppComponent,
    ChildComponent
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
