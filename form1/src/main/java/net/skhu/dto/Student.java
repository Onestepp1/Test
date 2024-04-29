package net.skhu.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
@NoArgsConstructor
public class Student {
	int id;
	String studentNo;
	String name;
	int departmentId;
	String phone;
	String sex;
	String email;


}
