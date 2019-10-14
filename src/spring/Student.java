package spring;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {

	/**基本类型（包装类） 或 String类型*/
	private int sid;
	private String sname;
	private String telepehone;
	
	/**引用类型*/
	private StuClass stuClass;
	
	/**数组*/
	private String[] hobbies;
			
	/**List集合*/
	private List<String> scores;
	private List<StuClass> list;
	
	/**Set集合*/
	private Set<String> courses;
	private Set<StuClass> set;
	
	/**Map集合*/
	private Map<String,Integer> courseAndScoreMap;
	
	/**Properties类型*/
	private Properties properties;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getTelepehone() {
		return telepehone;
	}

	public void setTelepehone(String telepehone) {
		this.telepehone = telepehone;
	}

	public StuClass getStuClass() {
		return stuClass;
	}

	public void setStuClass(StuClass stuClass) {
		this.stuClass = stuClass;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public List<String> getScores() {
		return scores;
	}

	public void setScores(List<String> scores) {
		this.scores = scores;
	}

	public List<StuClass> getList() {
		return list;
	}

	public void setList(List<StuClass> list) {
		this.list = list;
	}

	public Set<String> getCourses() {
		return courses;
	}

	public void setCourses(Set<String> courses) {
		this.courses = courses;
	}

	public Set<StuClass> getSet() {
		return set;
	}

	public void setSet(Set<StuClass> set) {
		this.set = set;
	}

	public Map<String, Integer> getCourseAndScoreMap() {
		return courseAndScoreMap;
	}

	public void setCourseAndScoreMap(Map<String, Integer> courseAndScoreMap) {
		this.courseAndScoreMap = courseAndScoreMap;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
}
