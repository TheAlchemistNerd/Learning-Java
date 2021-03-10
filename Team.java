public class Team {
	Member member;
	public Team(Member member) {
		this.member = member;
	}
	
	// here's our main method
	public static void main(String[] args) {
		Member myMember = new Member("Aurieel", "light", 10, 1);
		Team myTeam = new Team(myMember);
		System.out.println(myTeam.member.getName());
		System.out.println(myTeam.member.getType());
		System.out.println(myTeam.member.getLevel());
		System.out.println(myTeam.member.getRank());
	}
}

class Member {
	private String name;
	private String type;
	private int level;
	private int rank;
	
	public Member(String name, String type, int level, int rank) {
		this.name = name;
		this.type = type;
		this.level = level;
		this.rank = rank;
	}
	
	/* let's define our getter functions here */
	public String getName() { // what's your name?
		return this.name; // my name is ...
	}
	
	public String getType() { // what's your type?
		return this.type; // my type is ...
	}
	
	public int getLevel() { // what's your level?
		return this.level; // my level is ...
	}
	
	public int getRank() { // what's your rank?
		return this.rank; // my rank is ...
	}
}
	
	
		