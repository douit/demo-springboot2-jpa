package com.example.demo.entity;

import org.middol.starter.jpacomment.annotation.ColumnComment;
import org.middol.starter.jpacomment.annotation.TableComment;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nhanvien")
@TableComment("测试表")
public class NhanVienEntity {

		@Id //primary key
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@ColumnComment("测试属性id")
		private int id;
		
		@Column
		@ColumnComment("测试属性hoten")
		private String hoten;
		
		@Column
		@ColumnComment("测试属性ngaysinh")
		private Date ngaysinh;
}
