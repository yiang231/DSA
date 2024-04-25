package com.xjdl.struct;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Block {
	private int min;
	private int max;
	private int startIndex;
	private int endIndex;
}
