/**
 * 
 */
package com.sandbox.service.one.component;

/**
 * @author kbober
 *
 */
public class SimpleInjectableServiceOneImpl implements ISimpleInjectableServiceOne {
	
	private String greeting;
	private String name;
	
	/**
	 * Default Constructor
	 */
	public SimpleInjectableServiceOneImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Parameterized Constructor
	 * @param aGreeting
	 * @param aName
	 */
	public SimpleInjectableServiceOneImpl(String aGreeting, String aName) {
		super();
		greeting = aGreeting;
		name = aName;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String aGreeting) {
		greeting = aGreeting;
	}

	public String getName() {
		return name;
	}

	public void setName(String aName) {
		name = aName;
	}
	
	public void executeGreeting() {
		System.out.println(this.greeting+" "+this.name);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((greeting == null) ? 0 : greeting.hashCode());
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
		SimpleInjectableServiceOneImpl other = (SimpleInjectableServiceOneImpl) obj;
		if (greeting == null) {
			if (other.greeting != null)
				return false;
		} else if (!greeting.equals(other.greeting))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SimpleInjectableObject [greeting=" + greeting + ", name=" + name + "]";
	}
	
	
	
	

}
