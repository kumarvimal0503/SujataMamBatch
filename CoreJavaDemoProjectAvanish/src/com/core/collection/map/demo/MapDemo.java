package com.core.collection.map.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.security.auth.Subject;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("Fruit", "Apple");
		map.put("Animal", "Monkey");
		
		Set<Entry<String, String>> set = map.entrySet();
		for (Entry<String, String> entry : set) {
			System.out.println("Key: "+entry.getKey());
			System.out.println("value: "+entry.getValue());
		}
		
		System.out.println("******************************************");
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println("Key: "+key);
			System.out.println("value: "+map.get(key));
		}
		System.out.println("******************************************");
		Collection<String> values = map.values();
		for (String value : values) {
			System.out.println("value: "+value);
		}
	}

}

class MapDemo2 {
	public static void main(String[]rgs) {
		Student s1 = new Student("1","Avnish");
		Student s2 = new Student("2","Shoib");
		Student s3 = new Student("1","Avnish");
		
		List<String> subjects1 = new ArrayList<>();
		subjects1.add("Java");
		subjects1.add("C++");
		
		List<String> subjects2 = new ArrayList<>();
		subjects2.add("Perl");
		subjects2.add("SmallTalk");
		
		List<String> subjects3 = new ArrayList<>();
		subjects3.add("Php");
		subjects3.add("Python");
		
		Map<Student, List<String>> studSubjectMap = new HashMap<>();
		
		studSubjectMap.put(s1, subjects1);
		studSubjectMap.put(s2, subjects2);
		studSubjectMap.put(s3, subjects3);
		
		for(Map.Entry<Student, List<String>> entry : studSubjectMap.entrySet()) {
			Student student = entry.getKey();
			List<String> subjects = entry.getValue();
			
			System.out.println(student+": "+subjects);
		}
		
		
	}
}

class Student {
	String name;
	String id;

	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}
