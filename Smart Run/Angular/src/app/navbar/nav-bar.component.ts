import { Component,OnInit } from '@angular/core';
import { EmployeeService } from '../service/employee/employee.service'
import { Employee } from '../model/employee'


@Component({
  selector: 'app-nav-bar',
  templateUrl: './nav-bar.component.html',
  styleUrls: ['./nav-bar.component.css']
})
export class NavBarComponent implements OnInit {

  constructor( public employeeService: EmployeeService) {
    
  }

  ngOnInit(): void {
    this.getEmpDetails()
  }


  getEmpDetails() {
    this.employeeService.getEmpDetails()
  }

  deleteEmployee(empId: any,index: any){

    this.employeeService.deleteEmployee(empId).subscribe(res => {
      if(res){
        this.employeeService.employees.splice(index,1)
      }
    })
  }



}


