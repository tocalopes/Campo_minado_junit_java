package com.lopes.cm.model;

import java.util.ArrayList;
import java.util.List;

public class Field {
	
	private final int line;
	private final int column;
	
	private boolean isOpen = false;
	private boolean haveMine = false;
	private boolean isMarked = false;
	
	private List<Field> neighbors = new ArrayList<>();
	
	Field(int line, int column){
		this.line = line;
		this.column = column;
	}
	
	boolean addNeighbor(Field neighbor) {
		boolean differentLine = line != neighbor.line; //true
		boolean differentColumn = column != neighbor.column; //false
		boolean diagonal = differentLine && differentColumn; //false
		
		int lineDelta = Math.abs(line - neighbor.line); //1
		int columnDelta = Math.abs(column - neighbor.column);//0
		int generalDelta = Math.abs(lineDelta + columnDelta);//1
		
		if(generalDelta == 1 && !diagonal) {
			neighbors.add(neighbor);
			return true;
		}else if(generalDelta == 2 && diagonal) {
			neighbors.add(neighbor);
			return true;
		}else {
			return false;
		}
	}
	
	
}
