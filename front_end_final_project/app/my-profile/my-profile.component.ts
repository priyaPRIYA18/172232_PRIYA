import { Component, OnInit } from '@angular/core';
import { PatientService } from '../patient.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-my-profile',
  templateUrl: './my-profile.component.html',
  styleUrls: ['./my-profile.component.css']
})
export class MyProfileComponent implements OnInit {

  constructor(private patientService:PatientService,private route:Router) { }
  currentPatient:any;
  ngOnInit() {
    this.currentPatient=this.patientService.currentPatient;
    console.log("in my profile")
    console.log(this.currentPatient);


  }

  logout(){
    console.log('in logout')
    this.patientService.savePatient(null);
    this.route.navigateByUrl('patientLogin')
    


  }

}
