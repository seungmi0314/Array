package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {

	public void Practice1() {
		
		int arr[] = new int[9];  // 배열 선언 및 배열크기 할당
		int sum = 0;
		
		// i는 0부터 시작해서 배열 길이까지 하나씩 증가시키며 출력
		for(int i = 0; i < arr.length; i++) {
			// 0번째 순서에 +1 해서 1
			// 1번째 순서에 +1 해서 2
			// ...
			// 8번째 순서에 +1 해서 9
			arr[i] = i+1;	
			System.out.print(i+1);
			// 이렇게 뽑는 와중에 짝수들만 더해줄거임
			if( i%2==0) {
				sum += arr[i];
			}
			
		}
		System.out.println();
		System.out.println("짝수번째 인덱스의 합 : " + sum);
	} 
	
	public void Practice2() {
		
		int arr[] = new int[9];
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 9-i;
			System.out.print(9-i);
			if ( i %2 != 0) {
				sum += arr[i];
			}
		}
		System.out.println();
		System.out.println("홀수번째 인덱스의 합 : " + sum);
	}
	
	public void Practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int arr[] = new int[input];
		
		for(int i = 0; i < input; i++) {
			arr[i]=i+1;
			System.out.print(i+1);
		}
		
	}
	
	public void Practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 0 : ");
		int input0 = sc.nextInt();
		System.out.print("입력 1 : ");
		int input1 = sc.nextInt();
		System.out.print("입력 2 : ");
		int input2 = sc.nextInt();
		System.out.print("입력 3 : ");
		int input3 = sc.nextInt();
		System.out.print("입력 4 : ");
		int input4 = sc.nextInt();
		
		int arr[] = { input0, input1, input2, input3, input4};
		
		System.out.print("검색 할 값 : ");
		int search = sc.nextInt();
		
		
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == arr.length){
				System.out.print("인덱스 : " + arr[i]);
			}else {
				System.out.println("일치하는 값이 존재하지 않습니다");
			}
		}  
		
	}//?
	
	public void Practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 : ");
		String input = sc.nextLine();
		System.out.println("문자 : ");
		String input1 = sc.nextLine();
		
		char[] arr = new char[input.length()]; // 공간 생성
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i);
		}	
			
	
	}
	
	
	
}//
