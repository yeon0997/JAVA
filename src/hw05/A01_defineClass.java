/*
 * ?΄??€ ? ??κΈ?
 * [? κ·Όμ ?΄?] class ?΄??€?΄λ¦?{
 * λ©€λ²λ³??;
 * λ©μ?;
 * }
 * 
 * ?)
 * class Student {
 * ?λ²?;
 * ?±λͺ?;
 * ??;
 * μ£Όμ;
 * 
 * κ³΅λ???€();
 * }
 * 
 * class ?΄λ¦μ? ??λ¬Έμλ‘? ??
 * ??? java??Ό? ??? ?΄??€λ₯? ?? κ²μ΄ ?μΉμ΄?,
 * ?€?? ?΄??€κ°? κ°μ΄ ?? κ²½μ° public ?΄??€? ?¨ ???΄λ©?,
 * public ?΄??€?? ?λ°? ??Ό? ?΄λ¦μ? ??Ό?΄?Ό ??€.
 */
package hw05;

public class A01_defineClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student gildong = new Student();	//student?Ό? ?΄??€λ₯? κ°?μ§?κ³? gildong?΄?Ό? κ°μ²΄λ₯? λ§λ€?΄?Ό
		Student chunhyang = new Student();
		//gildong.name = "?κΈΈλ";
		gildong.address = "μ²??κ΅?";
	//	chunhyang.name = "?±μΆν₯";
		chunhyang.address = "??Ήκ΅?";
		
		gildong.study();
		chunhyang.study();
		
	}

}

