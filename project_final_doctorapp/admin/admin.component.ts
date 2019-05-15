import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder, FormGroup } from '../../../node_modules/@angular/forms';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  adminForm:FormGroup;
  constructor(private fb :FormBuilder) { }


  
  ngOnInit() {
    this.adminForm = this.fb.group({
    
      email: ['',[ Validators.required,Validators.pattern('[a-zA-Z0-9_.+-]+@gmail.com+$')] ],
    
      password:['',[ Validators.required,Validators.maxLength(15),Validators.minLength(6),	Validators.pattern('^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]+$')] ]
    
    });
  }

}
