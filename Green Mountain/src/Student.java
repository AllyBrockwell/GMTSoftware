
public class Student {

	private String school;
	private String sex;
	private int age;
	private String address;
	private String famsize;
	private String Pstatus;
	private int Medu;
	private int Fedu;
	private String Mjob;
	private String Fjob;
	private String reason;
	private String guardian;
	private int traveltime;
	private int studytime;
	private int failures;
	private String schoolsup;
	private String famsup;
	private String paid;
	private String activities;
	private String nursery;
	private String higher;
	private String internet;
	private String romantic;
	private int famrel;
	private int freetime;
	private int goout;
	private int Dalc;
	private int Walc;
	private int health;
	private int absences;
	private String G1;
	private String G2;
	private String G3;
	
	public Student(String school, String sex, int age, String address, String famsize, String Pstatus, int Medu, int Fedu, String Mjob, String Fjob, String reason, String guardian, int traveltime, int studytime, int failures, String schoolsup, String famsup, String paid, String activities, String nursery, String higher, String internet, String romantic, int famrel, int freetime, int goout, int Dalc, int Walc, int health, int absences, String G1, String G2, String G3) {
		super();
			this.school = school;
			this.sex = sex;
			this.age = age;
			this.address = address;
			this.famsize = famsize;
			this.Pstatus = Pstatus;
			this.Medu = Medu;
			this.Fedu = Fedu;
			this.Mjob = Mjob;
			this.Fjob = Fjob;
			this.reason = reason;
			this.guardian = guardian;
			this.traveltime = traveltime;
			this.studytime = studytime;
			this.failures = failures;
			this.schoolsup = schoolsup;
			this.famsup = famsup;
			this.paid = paid;
			this.activities = activities;
			this.nursery = nursery;
			this.higher = higher;
			this.internet = internet;
			this.romantic = romantic;
			this.famrel = famrel;
			this.freetime = freetime;		
			this.goout = goout;		
			this.Dalc = Dalc;		
			this.Walc = Walc;		
			this.health = health;		
			this.absences= absences;		
			this.G1 = G1;		
			this.G2 = G2;
			this.G3 = G3;
		
	}
	
	public Student() {
		this.school = school;
		this.sex = sex;
		this.age = age;
		this.address = address;
		this.famsize = famsize;
		this.Pstatus = Pstatus;
		this.Medu = Medu;
		this.Fedu = Fedu;
		this.Mjob = Mjob;
		this.Fjob = Fjob;
		this.reason = reason;
		this.guardian = guardian;
		this.traveltime = traveltime;
		this.studytime = studytime;
		this.failures = failures;
		this.schoolsup = schoolsup;
		this.famsup = famsup;
		this.paid = paid;
		this.activities = activities;
		this.nursery = nursery;
		this.higher = higher;
		this.internet = internet;
		this.romantic = romantic;
		this.famrel = famrel;
		this.freetime = freetime;		
		this.goout = goout;		
		this.Dalc = Dalc;		
		this.Walc = Walc;		
		this.health = health;		
		this.absences= absences;		
		this.G1 = G1;		
		this.G2 = G2;
		this.G3 = G3;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setFamsize(String famsize) {
		this.famsize = famsize;
	}
	public void setPstatus(String Pstatus) {
		this.Pstatus = Pstatus;
	}
	public void setMedu(int Medu) {
		this.Medu = Medu;
	}
	public void setFedu(int Fedu) {
		this.Fedu = Fedu;
	}
	public void setMjob(String Mjob) {
		this.Mjob = Mjob;
	}
	public void setFjob(String Fjob) {
		this.Fjob = Fjob;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public void setGuardian(String guardian) {
		this.guardian = guardian;
	}
	public void setTraveltime(int traveltime) {
		this.traveltime = traveltime;
	}
	public void setStudytime(int studytime) {
		this.studytime = studytime;
	}
	public void setFailures(int failures) {
		this.failures = failures;
	}
	public void setSchoolsup(String schoolsup) {
		this.schoolsup = schoolsup;
	}
	public void setFamsup(String famsup) {
		this.famsup = famsup;
	}
	public void setPaid(String paid){
		this.paid = paid;
	}
	public void setActivities(String activities) {
		this.activities = activities;
	}
	public void setNursery(String nursery) {
		this.nursery = nursery;
	}
	public void setHigher(String higher) {
		this.higher = higher;
	}
	public void setInternet(String internet) {
		this.internet = internet;
	}
	public void setRomantic(String romantic) {
		this.romantic = romantic;
	}
	public void setFamrel(int famrel) {
		this.famrel = famrel;
	}
	public void setFreetime(int freetime) {
		this.freetime = freetime;
	}
	public void setGoout(int goout) {
		this.goout = goout;
	}
	public void setDalc(int Dalc) {
		this.Dalc = Dalc;
	}
	public void setWalc(int Walc) {
		this.Walc = Walc;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public void setAbsences(int absences) {
		this.absences= absences;
	}
	public void setG1(String G1) {
		this.G1 = G1;
	}
	public void setG2(String G2) {
		this.G2 = G2;
	}
	public void setG3(String G3) {
		this.G3 = G3;
	}
	public String getSchool() {
		return school;
	}
	public String getSex() {
		return sex;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}
	public String getFamsize() {
		return famsize;
	}
	public String getPstatus() {
		return Pstatus;
	}
	public int getMedu() {
		return Medu;
	}
	public int getFedu() {
		return Fedu;
	}
	public String getMjob() {
		return Mjob;
	}
	public String getFjob() {
		return Fjob;
	}
	public String getReason() {
		return reason;
	}
	public String getGuardian() {
		return guardian;
	}
	public int getTraveltime() {
		return traveltime;
	}
	public int getStudytime() {
		return studytime;
	}
	public int getFailures() {
		return failures;
	}
	public String getSchoolsup() {
		return schoolsup;
	}
	public String getFamsup() {
		return famsup;
	}
	public String getPaid(){
		return paid;
	}
	public String getActivities() {
		return activities;
	}
	public String getNursery() {
		return nursery;
	}
	public String getHigher() {
		return higher;
	}
	public String getInternet() {
		return internet;
	}
	public String getRomantic() {
		return romantic;
	}
	public int getFamrel() {
		return famrel;
	}
	public int getFreetime() {
		return freetime;
	}
	public int getGoout() {
		return goout;
	}
	public int getDalc() {
		return Dalc;
	}
	public int getWalc() {
		return Walc;
	}
	public int getHealth() {
		return health;
	}
	public int getAbsences() {
		return absences;
	}
	public String getG1() {
		return G1;
	}
	public String getG2() {
		return G2;
	}
	public String getG3() {
		return G3;
	}
	
	public String toString() {
		return "School: " + getSchool() + " Sex: " + getSex() + " Age: " + getAge()+ " Address: " + getAddress()+ " FamSize: " + getFamsize() +" Pstatus " + getPstatus()+ " etc";
	}
	
}
