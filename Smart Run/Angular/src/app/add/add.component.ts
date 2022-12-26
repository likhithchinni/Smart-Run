import { Component,OnInit } from '@angular/core';
import { EmployeeService } from '../service/employee/employee.service'
import { Employee } from '../model/employee'

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent {

  newEmployee: Employee
  errorFlag: boolean = false;

  constructor(public employeeService: EmployeeService) {
    this.newEmployee = new Employee()
  }

  addPost(){

  }

  addEmployee(addEmployeeForm: any){

    // this.postsService.addPost(this.newPost).subscribe(res => {
    //   if (res) {
    //     this.postsService.posts.unshift(res)
    //     addPostForm.form.markAsPristine()
    //     this.newPost = new Post()
    //   }
    //   else
    //     this.errorFlag = true
    // })

    this.employeeService.addEmployee(this.newEmployee).subscribe(res => {
      if(res){
        this.employeeService.employees.unshift(res)
        addEmployeeForm.form.markAsPristine()
        this.newEmployee = new Employee()
      }
      else{
        this.errorFlag = true
      }
      

    })


  }

}
