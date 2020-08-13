package com.biz.frog.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class FrogVO {
	private String user;
	private String title;
	private String content;

}
