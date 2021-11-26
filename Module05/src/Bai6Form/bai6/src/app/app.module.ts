import {BrowserModule} from '@angular/platform-browser';
import {NgModule, OnInit} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {TodoComponent} from './todo/todo.component';
import {LoginComponent} from './login/login.component';
import {SigupComponent} from './sigup/sigup.component';
import {ReactiveFormsModule} from '@angular/forms';

const routesConfig: Routes = [{
  path: 'login', component: LoginComponent
},
  {path: 'sigup', component: SigupComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    TodoComponent,
    LoginComponent,
    SigupComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    RouterModule.forRoot(routesConfig)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
