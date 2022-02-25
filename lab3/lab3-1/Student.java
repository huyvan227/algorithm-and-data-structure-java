public class Student extends Person{
	protected float scoreMath;
	protected float scorePhysical;
	protected float scoreChemistry;
	
	public Student(){
		super();
		this.scoreMath = 0;
		this.scorePhysical = 0;
		this.scoreChemistry = 0;
	}
	
	public Student(String name, String address,float scoreMath, float scorePhysical, float scoreChemistry ){
		super(name, address);
		this.scoreMath = scoreMath;
		this.scorePhysical = scorePhysical;
		this.scoreChemistry = scoreChemistry;
	}
	
	public float getScoreMath(){
		return scoreMath;
	}
	
	public void setScoreMath(float scoreMath){
		this.scoreMath = scoreMath;
	}
	
	public float getScorePhysical(){
		return scorePhysical;
	}
	
	public void setScorePhysical(float scorePhysical){
		this.scorePhysical = scorePhysical;
	}
	
	public float getScoreChemistry(){
		return scoreChemistry;
	}
	
	public void setScoreChemistry(float scoreChemistry){
		this.scoreChemistry = scoreChemistry;
	}
	
	@Override
	public String toString(){
		return "name: " +name+ " address: " +address+ " math: " +scoreMath+ "physic: " +scorePhysical+ "chemistry: " +scoreChemistry+ "";
	}
}