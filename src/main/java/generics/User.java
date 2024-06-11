package generics;

public class User implements Comparable<User>
{

	private int points;

	public User(final int points)
	{
		this.points = points;
	}

	@Override
	public String toString()
	{
		return "User{" + "points=" + points + '}';
	}

	@Override
	public int compareTo(final User other)
	{

		return points - other.points;

		// OR

		//	 	 if the current object is less than the object passed as an argument then return -1
		//		if(points < o.points)
		//		{
		//			return -1;
		//		}
		//
		//		if the current object is greater than the object passed as an argument then return 1
		//		else if(this.points > o.points)
		//		{
		//			return 1;
		//		}
		//
		//		if the current object is equal to the object passed as an argument then return 0
		//		else
		//			return 0;
	}
}
