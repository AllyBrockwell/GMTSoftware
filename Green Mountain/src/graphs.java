import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class graphs {
	
	private static final String FILENAME = "student-mat.csv";
	private static final String DELIMITER = ";";
	private static final String NEWFILENAME = "averages.txt";
	private static final String FILEHEADER = "school,sex,age,address,famsize,Pstatus,Medu,Fedu,Mjob,Fjob,reason,guardian,traveltime,studytime,failures,schoolsup,famsup,paid,activities,nursery,higher,internet,romantic,famrel,freetime,goout,Dalc,Walc,health,absences,G1,G2,G3";
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";


	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new FileReader(FILENAME));
//		FileWriter writer = new FileWriter(NEWFILENAME);
		File file = new File(NEWFILENAME);
//		writer.append(FILEHEADER);
//		writer.append(NEW_LINE_SEPARATOR);
		PrintWriter writer = new PrintWriter(NEWFILENAME);
		
//		int GP =0;
//		int MS = 0;
//		int GPG1 = 0;
//		int GPG2 = 0;
//		int GPG3 = 0;
//		int MSG1 = 0;
//		int MSG2 = 0;
//		int MSG3 = 0;
//		int G115 = 0;
//		int G116 = 0;
//		int G117 = 0;
//		int G118 = 0;
//		int G119 = 0;
//		int G120 = 0;
//		int G121 = 0;
//		int G122 = 0;
//		int G215 = 0;
//		int G216 = 0;
//		int G217 = 0;
//		int G218 = 0;
//		int G219 = 0;
//		int G220 = 0;
//		int G221 = 0;
//		int G222 = 0;
//		int G315 = 0;
//		int G316 = 0;
//		int G317 = 0;
//		int G318 = 0;
//		int G319 = 0;
//		int G320 = 0;
//		int G321 = 0;
//		int G322 = 0;
//		int UG1 = 0;
//		int RG1 = 0;
//		int UG2 = 0;
//		int RG2 = 0;
//		int UG3 = 0;
//		int RG3 = 0;
//		int LE3G1 =0;
//		int GT3G1 = 0;
//		int LE3G2 =0;
//		int GT3G2 = 0;
//		int LE3G3 =0;
//		int GT3G3 = 0;
//		int TG1 = 0;
//		int AG1 = 0;
//		int TG2 = 0;
//		int AG2 = 0;
//		int TG3 = 0;
//		int AG3 = 0;
//		
//		int F = 0;
//		int M = 0;
//		int FG1 = 0;
//		int FG2 = 0;
//		int FG3 = 0;
//		int MG1 = 0;
//		int MG2 = 0;
//		int MG3 = 0;
//		int M0G1 = 0;
//		int M1G1 = 0;
//		int M2G1 = 0;
//		int M3G1 = 0;
//		int M4G1 = 0;
//		int F0G1 = 0;
//		int F1G1 = 0;
//		int F2G1 = 0;
//		int F3G1 = 0;
//		int F4G1 = 0;
//		int M0G2 = 0;
//		int M1G2 = 0;
//		int M2G2 = 0;
//		int M3G2 = 0;
//		int M4G2 = 0;
//		int F0G2 = 0;
//		int F1G2 = 0;
//		int F2G2 = 0;
//		int F3G2 = 0;
//		int F4G2 = 0;
//		int M0G3 = 0;
//		int M1G3 = 0;
//		int M2G3 = 0;
//		int M3G3 = 0;
//		int M4G3 = 0;
//		int F0G3 = 0;
//		int F1G3 = 0;
//		int F2G3 = 0;
//		int F3G3 = 0;
//		int F4G3 = 0;
		
//		int fifteen = 0;
//		int sixteen = 0;
//		int seventeen =0;
//		int eighteen = 0;
//		int nineteen = 0;
//		int twenty = 0;
//		int twentyone = 0;
//		int twentytwo = 0;
//		int U=0;
//		int R=0;
//		int LE3 =0;
//		int GT3 = 0;
//		int T =0;
//		int A = 0;
//		int M0 = 0;
//		int M1 = 0;
//		int M2 = 0;
//		int M3 = 0;
//		int M4 = 0;
//		int F0 = 0;
//		int F1 = 0;
//		int F2 = 0;
//		int F3 = 0;
//		int F4 = 0;
//		int MT = 0;
//		int MH = 0;
//		int MSE = 0;
//		int MA = 0;
//		int MO = 0;
//		int FT = 0;
//		int FH = 0;
//		int FSE = 0;
//		int FA = 0;
//		int FO = 0;
//		int home = 0;
//		int reputation =0;
//		int course =0;
//		int other = 0;
//		int Gmother =0;
//		int Gfather = 0;
//		int Gother = 0;
		int T1 =0;
		int T2 =0;
		int T3 =0;
		int T4 =0;
		int S1 =0;
		int S2 =0;
		int S3 =0;
		int S4 =0;
		int Fail1 = 0;
		int Fail2 = 0;
		int Fail3 = 0;
		int Fail4 = 0;
		int Internetyes = 0;
		int InternetyesG1 = 0;
		int InternetyesG2 = 0;
		int InternetyesG3 = 0;
		int Internetno = 0;
		int InternetnoG1 = 0;
		int InternetnoG2 = 0;
		int InternetnoG3 = 0;
		int Fail1G1 = 0;
		int Fail2G1 = 0;
		int Fail3G1 = 0;
		int Fail4G1 = 0;
		int Fail1G2 = 0;
		int Fail2G2 = 0;
		int Fail3G2 = 0;
		int Fail4G2 = 0;
		int Fail1G3 = 0;
		int Fail2G3 = 0;
		int Fail3G3 = 0;
		int Fail4G3 = 0;
		int S1G1 = 0;
		int S2G1 = 0;
		int S3G1 = 0;
		int S4G1 = 0;
		int S1G2 = 0;
		int S2G2 = 0;
		int S3G2 = 0;
		int S4G2 = 0;
		int S1G3 = 0;
		int S2G3 = 0;
		int S3G3 = 0;
		int S4G3 = 0;
		int T1G1 = 0;
		int T2G1 = 0;
		int T3G1 = 0;
		int T4G1 = 0;
		int T1G2 = 0;
		int T2G2 = 0;
		int T3G2 = 0;
		int T4G2 = 0;
		int T1G3 = 0;
		int T2G3 = 0;
		int T3G3 = 0;
		int T4G3 = 0;
		int H1 = 0;
		int H2 = 0;
		int H3 = 0;
		int H4 = 0;
		int H5 = 0;
		int H1G1 = 0;
		int H1G2 = 0;
		int H1G3 = 0;
		int H2G1 = 0;
		int H2G2 = 0;
		int H2G3 = 0;
		int H3G1 = 0;
		int H3G2 = 0;
		int H3G3 = 0;
		int H4G1 = 0;
		int H4G2 = 0;
		int H4G3 = 0;
		int H5G1 = 0;
		int H5G2 = 0;
		int H5G3 = 0;
		int A19=0;
		int A1019 = 0;
		int A2029=0;
		int A3039 = 0;
		int A4049 = 0;
		int A5059 = 0;
		int A6069 = 0;
		int A7079 = 0;
		int A8089 = 0;
		int A90 = 0;
		int A19G1=0;
		int A19G2=0;
		int A19G3=0;
		int A1019G1 = 0;
		int A2029G1=0;
		int A3039G1 = 0;
		int A4049G1 = 0;
		int A5059G1 = 0;
		int A6069G1 = 0;
		int A7079G1 = 0;
		int A8089G1 = 0;
		int A90G1 = 0;
		int A1019G2 = 0;
		int A2029G2=0;
		int A3039G2 = 0;
		int A4049G2 = 0;
		int A5059G2 = 0;
		int A6069G2 = 0;
		int A7079G2 = 0;
		int A8089G2 = 0;
		int A90G2 = 0;
		int A1019G3 = 0;
		int A2029G3=0;
		int A3039G3 = 0;
		int A4049G3 = 0;
		int A5059G3 = 0;
		int A6069G3 = 0;
		int A7079G3 = 0;
		int A8089G3 = 0;
		int A90G3 = 0;
		
		
		
		
		
		List<Student> stuList = new ArrayList<Student>();
		String line = " ";
		//Read to skip the header
		reader.readLine();
		//Reading from the second line
		while((line = reader.readLine()) != null) {
			String [] studentDetails = line.split(DELIMITER);
			
			if(studentDetails.length >0) {
				Student stu = new Student();
				stu.setSchool(studentDetails[0].replace("\"",""));
				stu.setSex(studentDetails[1].replace("\"",""));
				stu.setAge(Integer.parseInt(studentDetails[2].replace("\"","")));
				stu.setAddress(studentDetails[3].replace("\"",""));
				stu.setFamsize(studentDetails[4].replace("\"",""));
				stu.setPstatus(studentDetails[5].replace("\"",""));
				stu.setMedu(Integer.parseInt(studentDetails[6].replace("\"","")));
				stu.setFedu(Integer.parseInt(studentDetails[7].replace("\"","")));
		
				stu.setMjob(studentDetails[8].replace("\"",""));
//				if(stu.getMjob().equals("teacher")) {
//					MT++;
//				}if(stu.getMjob().equals("health")) {
//					MH++;
//				}if(stu.getMjob().equals("services")) {
//					MSE++;
//				}if(stu.getMjob().equals("at_home")) {
//					MA++;
//				}if(stu.getMjob().equals("other")) {
//					MO++;
//				}
				stu.setFjob(studentDetails[9].replace("\"",""));
//				if(stu.getFjob().equals("teacher")) {
//					FT++;
//				}if(stu.getFjob().equals("health")) {
//					FH++;
//				}if(stu.getFjob().equals("services")) {
//					FSE++;
//				}if(stu.getFjob().equals("at_home")) {
//					FA++;
//				}if(stu.getFjob().equals("other")) {
//					FO++;
//				}
				stu.setReason(studentDetails[10].replace("\"",""));
//				if(stu.getReason().equals("home")) {
//					home++;
//				}if(stu.getReason().equals("reputation")) {
//					reputation++;
//				}if(stu.getReason().equals("course")) {
//					course++;
//				}if(stu.getReason().equals("other")) {
//					other++;
//				}
				stu.setGuardian(studentDetails[11].replace("\"",""));
//				if(stu.getGuardian().equals("mother")) {
//					Gmother++;
//				}if(stu.getGuardian().equals("father")) {
//					Gfather++;
//				}if(stu.getGuardian().equals("other")) {
//					Gother++;
//				}
				stu.setTraveltime(Integer.parseInt(studentDetails[12].replace("\"","")));
				
				stu.setStudytime(Integer.parseInt(studentDetails[13].replace("\"","")));
				
				stu.setFailures(Integer.parseInt(studentDetails[14].replace("\"","")));
				
				stu.setSchoolsup(studentDetails[15].replace("\"",""));
				stu.setFamsup(studentDetails[16].replace("\"",""));
				stu.setPaid(studentDetails[17].replace("\"",""));
				stu.setActivities(studentDetails[18].replace("\"",""));
				stu.setNursery(studentDetails[19].replace("\"",""));
				stu.setHigher(studentDetails[20].replace("\"",""));
				stu.setInternet(studentDetails[21].replace("\"",""));
				
				stu.setRomantic(studentDetails[22].replace("\"",""));
				stu.setFamrel(Integer.parseInt(studentDetails[23].replace("\"","")));
				stu.setFreetime(Integer.parseInt(studentDetails[24].replace("\"","")));
				stu.setGoout(Integer.parseInt(studentDetails[25].replace("\"","")));
				stu.setDalc(Integer.parseInt(studentDetails[26].replace("\"","")));
				stu.setWalc(Integer.parseInt(studentDetails[27].replace("\"","")));
				stu.setHealth(Integer.parseInt(studentDetails[28].replace("\"","")));
				
				stu.setAbsences(Integer.parseInt(studentDetails[29].replace("\"","")));
				
				
				stu.setG1(studentDetails[30].replace("\"",""));
				stu.setG2(studentDetails[31].replace("\"",""));
				stu.setG3(studentDetails[32].replace("\"",""));
				stuList.add(stu);
				
				
				
				//Internet
				if(stu.getInternet().equals("yes")) {
					Internetyes++;
					InternetyesG1 += Integer.parseInt(stu.getG1());
					InternetyesG2 += Integer.parseInt(stu.getG2());
					InternetyesG3 += Integer.parseInt(stu.getG3());
				}else if(stu.getInternet().equals("no")) {
					Internetno++;
					InternetnoG1 += Integer.parseInt(stu.getG1());
					InternetnoG2 += Integer.parseInt(stu.getG2());
					InternetnoG3 += Integer.parseInt(stu.getG3());
				}
				
				
				
				//Failures
				if(stu.getFailures()==1) {
					Fail1++;
					Fail1G1 += Integer.parseInt(stu.getG1());
					Fail1G2 += Integer.parseInt(stu.getG2());
					Fail1G3 += Integer.parseInt(stu.getG3());
				}else if(stu.getFailures()==2) {
					Fail2++;
					Fail2G1 += Integer.parseInt(stu.getG1());
					Fail2G2 += Integer.parseInt(stu.getG2());
					Fail2G3 += Integer.parseInt(stu.getG3());
				}else if(stu.getFailures()==3) {
					Fail3++;
					Fail3G1 += Integer.parseInt(stu.getG1());
					Fail3G2 += Integer.parseInt(stu.getG2());
					Fail3G3 += Integer.parseInt(stu.getG3());
				}else{
					Fail4++;
					Fail4G1 += Integer.parseInt(stu.getG1());
					Fail4G2 += Integer.parseInt(stu.getG2());
					Fail4G3 += Integer.parseInt(stu.getG3());
				}
				
				
				
				//StudyTime
				if(stu.getStudytime()==1) {
					S1++;
					S1G1 += Integer.parseInt(stu.getG1());
					S1G2 += Integer.parseInt(stu.getG2());
					S1G3 += Integer.parseInt(stu.getG3());
				}if(stu.getStudytime()==2) {
					S2++;
					S2G1 += Integer.parseInt(stu.getG1());
					S2G2 += Integer.parseInt(stu.getG2());
					S2G3 += Integer.parseInt(stu.getG3());
				}if(stu.getStudytime()==3) {
					S3++;
					S3G1 += Integer.parseInt(stu.getG1());
					S3G2 += Integer.parseInt(stu.getG2());
					S3G3 += Integer.parseInt(stu.getG3());
				}if(stu.getStudytime()==4) {
					S4++;
					S4G1 += Integer.parseInt(stu.getG1());
					S4G2 += Integer.parseInt(stu.getG2());
					S4G3 += Integer.parseInt(stu.getG3());
				}
				
				
				
				
				//Absences
				if(stu.getAbsences()==0 ||stu.getAbsences()==1||stu.getAbsences()==2||stu.getAbsences()==3||stu.getAbsences()==4||stu.getAbsences()==5||stu.getAbsences()==6||stu.getAbsences()==7||stu.getAbsences()==8||stu.getAbsences()==9) {
					A19++;
					A19G1 += Integer.parseInt(stu.getG1());
					A19G2 += Integer.parseInt(stu.getG2());
					A19G3 += Integer.parseInt(stu.getG3());
				}
				if(stu.getAbsences()==10 ||stu.getAbsences()==11||stu.getAbsences()==12||stu.getAbsences()==13||stu.getAbsences()==14||stu.getAbsences()==15||stu.getAbsences()==16||stu.getAbsences()==17||stu.getAbsences()==18||stu.getAbsences()==19) {
					A1019++;
					A1019G1 += Integer.parseInt(stu.getG1());
					A1019G2 += Integer.parseInt(stu.getG2());
					A1019G3 += Integer.parseInt(stu.getG3());
				}
				if(stu.getAbsences()==20 ||stu.getAbsences()==21||stu.getAbsences()==22||stu.getAbsences()==23||stu.getAbsences()==24||stu.getAbsences()==25||stu.getAbsences()==26||stu.getAbsences()==27||stu.getAbsences()==28||stu.getAbsences()==29) {
					A2029++;
					A2029G1 += Integer.parseInt(stu.getG1());
					A2029G2 += Integer.parseInt(stu.getG2());
					A2029G3 += Integer.parseInt(stu.getG3());
				}
				if(stu.getAbsences()>29 && stu.getAbsences()<40) {
					A3039++;
					A3039G1 += Integer.parseInt(stu.getG1());
					A3039G2 += Integer.parseInt(stu.getG2());
					A3039G3 += Integer.parseInt(stu.getG3());
				}
				if(stu.getAbsences()>39 && stu.getAbsences()<50) {
					A4049++;
					A4049G1 += Integer.parseInt(stu.getG1());
					A4049G2 += Integer.parseInt(stu.getG2());
					A4049G3 += Integer.parseInt(stu.getG3());
				}if(stu.getAbsences()>49 && stu.getAbsences()<60) {
					A5059++;
					A5059G1 += Integer.parseInt(stu.getG1());
					A5059G2 += Integer.parseInt(stu.getG2());
					A5059G3 += Integer.parseInt(stu.getG3());
				}
				if(stu.getAbsences()>59 && stu.getAbsences()<70) {
					A6069++;
					A6069G1 += Integer.parseInt(stu.getG1());
					A6069G2 += Integer.parseInt(stu.getG2());
					A6069G3 += Integer.parseInt(stu.getG3());
				}
				if(stu.getAbsences()>69 && stu.getAbsences()<80) {
					A7079++;
					A7079G1 += Integer.parseInt(stu.getG1());
					A7079G2 += Integer.parseInt(stu.getG2());
					A7079G3 += Integer.parseInt(stu.getG3());
				}
				if(stu.getAbsences()>79 && stu.getAbsences()<90) {
					A8089++;
					A8089G1 += Integer.parseInt(stu.getG1());
					A8089G2 += Integer.parseInt(stu.getG2());
					A8089G3 += Integer.parseInt(stu.getG3());
				}
				if(stu.getAbsences()>89 && stu.getAbsences()<93) {
					A90++;
					A90G1 += Integer.parseInt(stu.getG1());
					A90G2 += Integer.parseInt(stu.getG2());
					A90G3 += Integer.parseInt(stu.getG3());
				}
				//Health
				if(stu.getHealth()==1) {
					H1++;
					H1G1 += Integer.parseInt(stu.getG1());
					H1G2 += Integer.parseInt(stu.getG2());
					H1G3 += Integer.parseInt(stu.getG3());
				}else if(stu.getHealth()==2) {
					H2++;
					H2G1 += Integer.parseInt(stu.getG1());
					H2G2 += Integer.parseInt(stu.getG2());
					H2G3 += Integer.parseInt(stu.getG3());
				}else if(stu.getHealth()==3) {
					H3++;
					H3G1 += Integer.parseInt(stu.getG1());
					H3G2 += Integer.parseInt(stu.getG2());
					H3G3 += Integer.parseInt(stu.getG3());
				}else if(stu.getHealth()==4) {
					H4++;
					H4G1 += Integer.parseInt(stu.getG1());
					H4G2 += Integer.parseInt(stu.getG2());
					H4G3 += Integer.parseInt(stu.getG3());
				}else if(stu.getHealth()==5) {
					H5++;
					H5G1 += Integer.parseInt(stu.getG1());
					H5G2 += Integer.parseInt(stu.getG2());
					H5G3 += Integer.parseInt(stu.getG3());
				}
				
				
				
				//Travel Time
				if(stu.getTraveltime()==1) {
					T1++;
					T1G1 += Integer.parseInt(stu.getG1());
					T1G2 += Integer.parseInt(stu.getG2());
					T1G3 += Integer.parseInt(stu.getG3());
				}if(stu.getTraveltime()==2) {
					T2++;
					T2G1 += Integer.parseInt(stu.getG1());
					T2G2 += Integer.parseInt(stu.getG2());
					T2G3 += Integer.parseInt(stu.getG3());
				}if(stu.getTraveltime()==3) {
					T3++;
					T3G1 += Integer.parseInt(stu.getG1());
					T3G2 += Integer.parseInt(stu.getG2());
					T3G3 += Integer.parseInt(stu.getG3());
				}if(stu.getTraveltime()==4) {
					T4++;
					T4G1 += Integer.parseInt(stu.getG1());
					T4G2 += Integer.parseInt(stu.getG2());
					T4G3 += Integer.parseInt(stu.getG3());
				}
				
				
//				//School
//				if(stu.getSchool().equals("GP")){
//					GP++;
//					GPG1 += Integer.parseInt(stu.getG1());
//					GPG2 += Integer.parseInt(stu.getG2());
//					GPG3 += Integer.parseInt(stu.getG3());
//				}else if(stu.getSchool().equals("MS")){
//					MS++;
//					MSG1 += Integer.parseInt(stu.getG1());
//					MSG2 += Integer.parseInt(stu.getG2());
//					MSG3 += Integer.parseInt(stu.getG3());
//				}
//				//Sex
//				if(stu.getSex().equals("F")) {
//					F++;
//					FG1 += Integer.parseInt(stu.getG1());
//					FG2 += Integer.parseInt(stu.getG2());
//					FG3 += Integer.parseInt(stu.getG3());
//				}
//				if(stu.getSex().equals("M")) {
//					M++;
//					MG1 += Integer.parseInt(stu.getG1());
//					MG2 += Integer.parseInt(stu.getG2());
//					MG3 += Integer.parseInt(stu.getG3());
//				}
//				//Age
//				if(stu.getAge() == 15) {
//					fifteen++;
//					G115 += Integer.parseInt(stu.getG1());
//					G215 += Integer.parseInt(stu.getG2());
//					G315 += Integer.parseInt(stu.getG3());
//				}
//				if(stu.getAge() == 16) {
//					sixteen++;
//					G116 += Integer.parseInt(stu.getG1());
//					G216 += Integer.parseInt(stu.getG2());
//					G316 += Integer.parseInt(stu.getG3());
//				}
//				if(stu.getAge() == 17) {
//					seventeen++;
//					G117 += Integer.parseInt(stu.getG1());
//					G217 += Integer.parseInt(stu.getG2());
//					G317 += Integer.parseInt(stu.getG3());
//				}if(stu.getAge() == 18) {
//					eighteen++;
//					G118 += Integer.parseInt(stu.getG1());
//					G218 += Integer.parseInt(stu.getG2());
//					G318 += Integer.parseInt(stu.getG3());
//				}if(stu.getAge() == 19) {
//					nineteen++;
//					G119 += Integer.parseInt(stu.getG1());
//					G219 += Integer.parseInt(stu.getG2());
//					G319 += Integer.parseInt(stu.getG3());
//				}if(stu.getAge() == 20) {
//					twenty++;
//					G120 += Integer.parseInt(stu.getG1());
//					G220 += Integer.parseInt(stu.getG2());
//					G320 += Integer.parseInt(stu.getG3());
//				}if(stu.getAge() == 21) {
//					twentyone++;
//					G121 += Integer.parseInt(stu.getG1());
//					G221 += Integer.parseInt(stu.getG2());
//					G321 += Integer.parseInt(stu.getG3());
//				}if(stu.getAge() == 22) {
//					twentytwo++;
//					G122 += Integer.parseInt(stu.getG1());
//					G222 += Integer.parseInt(stu.getG2());
//					G322 += Integer.parseInt(stu.getG3());
//				}
//				//Address
//				if(stu.getAddress().equals("U")) {
//					U++;
//					UG1 += Integer.parseInt(stu.getG1());
//					UG2 += Integer.parseInt(stu.getG2());
//					UG3 += Integer.parseInt(stu.getG3());
//				}
//				if(stu.getAddress().equals("R")) {
//					R++;
//					RG1 += Integer.parseInt(stu.getG1());
//					RG2 += Integer.parseInt(stu.getG2());
//					RG3 += Integer.parseInt(stu.getG3());
//				}
//				//Fam Size
//				if(stu.getFamsize().equals("LE3")) {
//					LE3++;
//					LE3G1 += Integer.parseInt(stu.getG1());
//					LE3G2 += Integer.parseInt(stu.getG2());
//					LE3G3 += Integer.parseInt(stu.getG3());
//				}if(stu.getFamsize().equals("GT3")) {
//					GT3++;
//					GT3G1 += Integer.parseInt(stu.getG1());
//					GT3G2 += Integer.parseInt(stu.getG2());
//					GT3G3 += Integer.parseInt(stu.getG3());
//				}
//				//Pstatus
//				if(stu.getPstatus().equals("T")) {
//					T++;
//					TG1 += Integer.parseInt(stu.getG1());
//					TG2 += Integer.parseInt(stu.getG2());
//					TG3 += Integer.parseInt(stu.getG3());
//				}if(stu.getPstatus().equals("A")) {
//					A++;
//					AG1 += Integer.parseInt(stu.getG1());
//					AG2 += Integer.parseInt(stu.getG2());
//					AG3 += Integer.parseInt(stu.getG3());
//				}
//				//Medu
//				if(stu.getMedu()==0) {
//					M0++;
//					M0G1 += Integer.parseInt(stu.getG1());
//					M0G2 += Integer.parseInt(stu.getG2());
//					M0G3 += Integer.parseInt(stu.getG3());
//				}if(stu.getMedu()==1) {
//					M1++;
//					M1G1 += Integer.parseInt(stu.getG1());
//					M1G2 += Integer.parseInt(stu.getG2());
//					M1G3 += Integer.parseInt(stu.getG3());
//				}if(stu.getMedu()==2) {
//					M2++;
//					M2G1 += Integer.parseInt(stu.getG1());
//					M2G2 += Integer.parseInt(stu.getG2());
//					M2G3 += Integer.parseInt(stu.getG3());
//				}if(stu.getMedu()==3) {
//					M3++;
//					M3G1 += Integer.parseInt(stu.getG1());
//					M3G2 += Integer.parseInt(stu.getG2());
//					M3G3 += Integer.parseInt(stu.getG3());
//				}if(stu.getMedu()==4) {
//					M4++;
//					M4G1 += Integer.parseInt(stu.getG1());
//					M4G2 += Integer.parseInt(stu.getG2());
//					M4G3 += Integer.parseInt(stu.getG3());
//				}
//				//Fedu
//				if(stu.getFedu()==0) {
//					F0++;
//					F0G1 += Integer.parseInt(stu.getG1());
//					F0G2 += Integer.parseInt(stu.getG2());
//					F0G3 += Integer.parseInt(stu.getG3());
//				}if(stu.getFedu()==1) {
//					F1++;
//					F1G1 += Integer.parseInt(stu.getG1());
//					F1G2 += Integer.parseInt(stu.getG2());
//					F1G3 += Integer.parseInt(stu.getG3());
//				}if(stu.getFedu()==2) {
//					F2++;
//					F2G1 += Integer.parseInt(stu.getG1());
//					F2G2 += Integer.parseInt(stu.getG2());
//					F2G3 += Integer.parseInt(stu.getG3());
//				}if(stu.getFedu()==3) {
//					F3++;
//					F3G1 += Integer.parseInt(stu.getG1());
//					F3G2 += Integer.parseInt(stu.getG2());
//					F3G3 += Integer.parseInt(stu.getG3());
//				}if(stu.getFedu()==4) {
//					F4++;
//					F4G1 += Integer.parseInt(stu.getG1());
//					F4G2 += Integer.parseInt(stu.getG2());
//					F4G3 += Integer.parseInt(stu.getG3());
//				}
			}

		}
//		for(Student s : stuList) {
//			System.out.println(s.getSchool() + " " + s.getSex()+ " " + s.getAge()+ " " + s.getAddress() + " " + s.getFamsize()+ " " +s.getPstatus()+ " " +s.getMedu()+ " " +s.getFedu()+ " " +s.getMjob()+ " " +s.getFjob()+ " " +s.getReason()+ " " +s.getGuardian() + " " +s.getTraveltime()+ " " +s.getStudytime()+ " " +s.getFailures()+ " " +s.getSchoolsup()+ " " +s.getFamsup()+ " " +s.getPaid()+ " " +s.getActivities()+ " " +s.getNursery()+ " " +s.getHigher()+ " " +s.getInternet()+ " " +s.getRomantic()+ " " +s.getFamrel()+ " " +s.getFreetime()+ " " +s.getGoout()+ " " +s.getDalc()+ " " +s.getWalc()+ " " +s.getHealth()+ " " +s.getAbsences()+ " " +s.getG1()+ " " +s.getG2()+ " " +s.getG3());
//		}
		
		
		writer.println("Yes Internet");
		writer.println(" G1: " + InternetyesG1/Internetyes);
		writer.println(" G2: " + InternetyesG2/Internetyes);
		writer.println(" G2: " + InternetyesG3/Internetyes);
		writer.println("No Internet");
		writer.println(" G1: " + InternetnoG1/Internetno);
		writer.println(" G2: " + InternetnoG2/Internetno);
		writer.println(" G2: " + InternetnoG3/Internetno);
		writer.println("1 Fail: ");
		writer.println(" G1: "+ Fail1G1/Fail1);
		writer.println(" G2: "+ Fail1G2/Fail1);
		writer.println(" G3: "+ Fail1G3/Fail1);
		writer.println("2 Fail: ");
		writer.println(" G1: "+ Fail2G1/Fail2);
		writer.println(" G2: "+ Fail2G2/Fail2);
		writer.println(" G3: "+ Fail2G3/Fail2);
		writer.println("3 Fail: ");
		writer.println(" G1: "+ Fail3G1/Fail3);
		writer.println(" G2: "+ Fail3G2/Fail3);
		writer.println(" G3: "+ Fail3G3/Fail3);
		writer.println("Otherwise: ");
		writer.println(" G1: "+ Fail4G1/Fail4);
		writer.println(" G2: "+ Fail4G2/Fail4);
		writer.println(" G3: "+ Fail4G3/Fail4);
		writer.println("<2 hours study");
		writer.println(" G1: " + S1G1/S1);
		writer.println(" G2: " + S1G2/S1);
		writer.println(" G3: " + S1G3/S1);
		writer.println("2-5 hours study");
		writer.println(" G1: " + S2G1/S2);
		writer.println(" G2: " + S2G2/S2);
		writer.println(" G3: " + S2G3/S2);
		writer.println("5-10 hours study");
		writer.println(" G1: " + S3G1/S3);
		writer.println(" G2: " + S3G2/S3);
		writer.println(" G3: " + S3G3/S3);
		writer.println(">10 hours study");
		writer.println(" G1: " + S4G1/S4);
		writer.println(" G2: " + S4G2/S4);
		writer.println(" G3: " + S4G3/S4);
		
		writer.println("0-9 Absenses");
		writer.println(" G1: " + A19G1/A19);
		writer.println(" G2: " + A19G2/A19);
		writer.println(" G3: " + A19G3/A19);
		writer.println("10-19 Absenses");
		writer.println(" G1: " + A1019G1/A1019);
		writer.println(" G2: " + A1019G2/A1019);
		writer.println(" G3: " + A1019G3/A1019);
		writer.println("20-29 Absenses");
		writer.println(" G1: " + A2029G1/A2029);
		writer.println(" G2: " + A2029G2/A2029);
		writer.println(" G3: " + A2029G3/A2029);
		writer.println("30-39 Absenses");
		writer.println(" G1: " + A3039G1/A3039);
		writer.println(" G2: " + A3039G2/A3039);
		writer.println(" G3: " + A3039G3/A3039);
		writer.println("40-49 Absenses");
		writer.println(" G1: " + A4049G1/A4049);
		writer.println(" G2: " + A4049G2/A4049);
		writer.println(" G3: " + A4049G3/A4049);
		writer.println("50-59 Absenses");
		writer.println(" G1: " + A5059G1/A5059);
		writer.println(" G2: " + A5059G2/A5059);
		writer.println(" G3: " + A5059G3/A5059);
		writer.println("60-69 Absenses");
		writer.println(" G1: " + 0);
		writer.println(" G2: " + 0);
		writer.println(" G3: " + 0);
		writer.println("70-79 Absenses");
		writer.println(" G1: " + A7079G1/A7079);
		writer.println(" G2: " + A7079G2/A7079);
		writer.println(" G3: " + A7079G3/A7079);
		writer.println("80-89 Absenses");
		writer.println(" G1: " + 0);
		writer.println(" G2: " + 0);
		writer.println(" G3: " + 0);
		writer.println("90-93 Absenses");
		writer.println(" G1: " + 0);
		writer.println(" G2: " + 0);
		writer.println(" G3: " + 0);
		writer.println("very bad health");
		writer.println(" G1: " + H1G1/H1);
		writer.println(" G2: " + H1G2/H1);
		writer.println(" G3: " + H1G3/H1);
		writer.println("below average health");
		writer.println(" G1: " + H2G1/H2);
		writer.println(" G2: " + H2G2/H2);
		writer.println(" G3: " + H2G3/H2);
		writer.println("average health");
		writer.println(" G1: " + H3G1/H3);
		writer.println(" G2: " + H3G2/H3);
		writer.println(" G3: " + H3G3/H3);
		writer.println("above average health");
		writer.println(" G1: " + H4G1/H4);
		writer.println(" G2: " + H4G2/H4);
		writer.println(" G3: " + H4G3/H4);
		writer.println("very good health");
		writer.println(" G1: " + H4G1/H4);
		writer.println(" G2: " + H4G2/H4);
		writer.println(" G3: " + H4G3/H4);
		writer.println("<15 min travel");
		writer.println(" G1: " + T1G1/T1);
		writer.println(" G2: " + T1G2/T1);
		writer.println(" G3: " + T1G3/T1);
		writer.println("15-30 min travel");
		writer.println(" G1: " + T2G1/T2);
		writer.println(" G2: " + T2G2/T2);
		writer.println(" G3: " + T2G3/T2);
		writer.println("30 min - 1 hour travel");
		writer.println(" G1: " + T3G1/T3);
		writer.println(" G2: " + T3G2/T3);
		writer.println(" G3: " + T3G3/T3);
		writer.println(">1 hour travel");
		writer.println(" G1: " + T4G1/T4);
		writer.println(" G2: " + T4G2/T4);
		writer.println(" G3: " + T4G3/T4);
		
//		writer.println("GPG1: "+GPG1/GP);
//		writer.println("MSG1: "+MSG1/MS);
//		writer.println("GPG2: "+GPG2/GP);
//		writer.println("MSG2: "+MSG2/MS);
//		writer.println("GPG3: "+GPG3/GP);
//		writer.println("MSG3: "+MSG3/MS);
//		writer.println("Female G1: " +FG1/F );
//		writer.println("Male G1: " +MG1/M );
//		writer.println("Female G2: " +FG2/F );
//		writer.println("Male G2: " +MG2/M );
//		writer.println("Female G3: " +FG3/F );
//		writer.println("Male G3: " +MG3/M );
//		writer.println("15G1: " + G115/fifteen);
//		writer.println("16G1: " + G116/sixteen);
//		writer.println("17G1: " + G117/seventeen);
//		writer.println("18G1: " + G118/eighteen);
//		writer.println("19G1: " + G119/nineteen);
//		writer.println("20G1: " + G120/twenty);
//		writer.println("21G1: " + G121/twentyone);
//		writer.println("22G1: " + G122/twentytwo);
//		writer.println("15G2: " + G215/fifteen);
//		writer.println("16G2: " + G216/sixteen);
//		writer.println("17G2: " + G217/seventeen);
//		writer.println("18G2: " + G218/eighteen);
//		writer.println("19G2: " + G219/nineteen);
//		writer.println("20G2: " + G220/twenty);
//		writer.println("21G2: " + G221/twentyone);
//		writer.println("22G2: " + G222/twentytwo);
//		writer.println("15G3: " + G315/fifteen);
//		writer.println("16G3: " + G316/sixteen);
//		writer.println("17G3: " + G317/seventeen);
//		writer.println("18G3: " + G318/eighteen);
//		writer.println("19G3: " + G319/nineteen);
//		writer.println("20G3: " + G320/twenty);
//		writer.println("21G3: " + G321/twentyone);
//		writer.println("22G3: " + G322/twentytwo);
//		writer.println("Urban G1: "+ UG1/U);
//		writer.println("Rural G1: " + RG1/R);
//		writer.println("Urban G2: "+ UG2/U);
//		writer.println("Rural G2: " + RG2/R);
//		writer.println("Urban G3: "+ UG3/U);
//		writer.println("Rural G3: " + RG3/R);
//		writer.println("LE3 G1: "+ LE3G1/LE3);
//		writer.println("GT3 G1: " + GT3G1/GT3);
//		writer.println("LE3 G2: "+ LE3G2/LE3);
//		writer.println("GT3 G2: " + GT3G2/GT3);
//		writer.println("LE3 G3: "+ LE3G3/LE3);
//		writer.println("GT3 G3: " + GT3G3/GT3);
//		writer.println("Together G1: "+ TG1/T);
//		writer.println("Apart G1: " + AG1/A);
//		writer.println("Together G2: "+ TG2/T);
//		writer.println("Apart G2: " + AG2/A);
//		writer.println("Together G3: "+ TG3/T);
//		writer.println("Apart G3: " + AG3/A);
//		writer.println("Mom edu 0 G1: " + M0G1/M0);
//		writer.println("Mom edu 1 G1: " + M0G1/M1);
//		writer.println("Mom edu 2 G1: " + M0G1/M2);
//		writer.println("Mom edu 3 G1: " + M0G1/M3);
//		writer.println("Mom edu 4 G1: " + M0G1/M4);
//		writer.println("Mom edu 0 G2: " + M0G2/M0);
//		writer.println("Mom edu 1 G2: " + M0G2/M1);
//		writer.println("Mom edu 2 G2: " + M0G2/M2);
//		writer.println("Mom edu 3 G2: " + M0G2/M3);
//		writer.println("Mom edu 4 G2: " + M0G2/M4);
//		writer.println("Mom edu 0 G3: " + M0G3/M0);
//		writer.println("Mom edu 1 G3: " + M0G3/M1);
//		writer.println("Mom edu 2 G3: " + M0G3/M2);
//		writer.println("Mom edu 3 G3: " + M0G3/M3);
//		writer.println("Mom edu 4 G3: " + M0G3/M4);
//		writer.println("Dad edu 0 G1: " + F0G1/F0);
//		writer.println("Dad edu 1 G1: " + F0G1/F1);
//		writer.println("Dad edu 2 G1: " + F0G1/F2);
//		writer.println("Dad edu 3 G1: " + F0G1/F3);
//		writer.println("Dad edu 4 G1: " + F0G1/F4);
//		writer.println("Dad edu 0 G2: " + F0G2/F0);
//		writer.println("Dad edu 1 G2: " + F0G2/F1);
//		writer.println("Dad edu 2 G2: " + F0G2/F2);
//		writer.println("Dad edu 3 G2: " + F0G2/F3);
//		writer.println("Dad edu 4 G2: " + F0G2/F4);
//		writer.println("Dad edu 0 G3: " + F0G3/F0);
//		writer.println("Dad edu 1 G3: " + F0G3/F1);
//		writer.println("Dad edu 2 G3: " + F0G3/F2);
//		writer.println("Dad edu 3 G3: " + F0G3/F3);
//		writer.println("Dad edu 4 G3: " + F0G3/F4);
		writer.close();		
	}

}
