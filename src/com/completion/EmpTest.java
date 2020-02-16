package com.completion;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class EmpTest {
	
	Customer cust = new Customer();
	
	ResponseObject res = new ResponseObject();
	
	public CompletableFuture<ResponseObject> empDetails(Employee emp) {
		CompletableFuture<Employee> cf = CompletableFuture.completedFuture(emp);
		return cf.thenApply(e ->{
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@");
			if (e.getName().equals("Anil")) {
				cust.setName(e.getName());
				res.setAdd("XYZ");
			}
			if(e.getId().equals("1")) {
				System.out.println("########################");
				CompletableFuture<String> cs = getCustAdd();
				CompletableFuture<Customer> ccust = cs.thenApply(add -> {
					cust.setAdd(add);
					return cust;
				});
				ccust.thenApply(cust->{
					System.out.println("&&&&&&&&&&&&777");
					res.setAdd(cust.getAdd());
					res.setName(cust.getName());
					return res;
				});
			}
			System.out.println("^^^^^^^^^^^^^^^ ::: "+res);
			//return CompletableFuture.completedFuture(res);
			return res;
		});
	}
	
	public CompletableFuture<String> getCustAdd() {
		return CompletableFuture.completedFuture("Bangalore");
	}
	
	public static void main(String[] args) {
		
		EmpTest et = new EmpTest();
		Employee emp = new Employee();
		emp.setAdd("delhi");
		emp.setName("Anil");
		emp.setAge("60");
		emp.setId("1");
		System.out.println(emp);
		try {
			ResponseObject res = et.empDetails(emp).get();
			System.out.println(res);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}
}
