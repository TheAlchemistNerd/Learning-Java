import java.util.*;

public class Spell
{
	public String name;
	public SpellType type;
	public String description;
	
	public enum SpellType {SPELL, CHARM, CURSE}
	
	public Spell(String spellName, SpellType spellType,
		String spellDescription)
	{
		name = spellName;
		type = spellType;
		description = spellDescription;
	}
	
	public String toString()
	{
		return name;
	}
	
	public static void main(String[] args)
	{
		ArrayList<Spell> spells = new ArrayList<>();
		spells.add(new Spell("Aparecium", Spell.SpellType.SPELL,
		"Make iinvisible inks appear."));
		
		spells.add(new Spell("Avis", Spell.SpellType.SPELL,
		"Launches birds from your wand."));
		
		spells.add(new Spell("Engorgio", Spell.SpellType.CHARM,
		"Enlarges something."));
		
		spells.add(new Spell("Fidelius", Spell.SpellType.CHARM,
		"Hides secrets within someone."));
		
		spells.add(new Spell("Finite Incatatum", Spell.SpellType.SPELL,
		"Stops all current spells."));
		
		spells.add(new Spell("Locomotor mortis", Spell.SpellType.CURSE,
		"Locks an oopponent's legs."));
		
		/*
		
		//  commented code is implemented using streams
		for (Spell spell : spells)
			System.out.println(spell.name);
		
		*/
		
		spells.stream().forEach(s -> System.out.println(s));
		
		/*for (Spell spell : spells)
		{
			if (spell.type == Spell.SpellType.SPELL)
				System.out.println(spell.name);
		}
		*/
		
		System.out.println(
			"\nA list of comprised of spells only.");
		
		spells.stream()
			.filter(s -> s.type == Spell.SpellType.SPELL)
			.forEach(s -> System.out.println(s));
		
		System.out.println(
			"\nSpells starting with 'a'");
		spells.parallelStream()
			.filter(s -> s.type == Spell.SpellType.SPELL)		// return a stream object
			.filter(s -> s.name.toLowerCase().startsWith("a"))
			.forEach(s -> System.out.println(s));				// doesn't return a stream object	
	}
}