package com.designpattern.controller;

import com.designpattern.entities.MergeSort;
import com.designpattern.entities.QuickSort;
import com.designpattern.handlers.AlgorithmFacade;
import com.designpattern.entities.BubbleSort;

/**
 * Apply Facade Pattern
 * 
 * @author taila
 *
 */
public class SortingManager {

	private AlgorithmFacade bubbleSort;
	private AlgorithmFacade mergeSort;
	private AlgorithmFacade quickSort;
	
	public SortingManager() {
		this.bubbleSort = new BubbleSort();
		this.mergeSort = new MergeSort();
		this.quickSort = new QuickSort();
	}
	
	public void doBubbleSort() {
		this.bubbleSort.sort();
	}
	
	public void doMergeSort() {
		this.mergeSort.sort();
	}
	
	public void doQuickSort() {
		this.quickSort.sort();
	}
}
