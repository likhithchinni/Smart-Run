import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Employee } from 'src/app/model/employee';



@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  employees: Employee[] = [];

  constructor(public http: HttpClient) { }

  getEmpDetails() {
    //throw new Error('Method not implemented.');
    this.http.get<Employee[]>('http://localhost:8080/employee/view').subscribe(res => {
      this.employees = res
      console.log(res)
    })
  }

  addEmployee(newEmployee: Employee) {
    return this.http.post<Employee>('http://localhost:8080/employee/add',newEmployee)
  }


  deleteEmployee(empId: any) {
    return this.http.delete<boolean>('http://localhost:8080/employee/delete/' + empId)
  }




}
