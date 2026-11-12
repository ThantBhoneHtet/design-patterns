package facade_pattern;

public class WithoutFacade {
	public static void main(String[]args)
	{
		Cpu cpu = new Cpu();
		Memory memory = new Memory();
		HardDisk hd = new HardDisk();
		
		hd.loadBootSector();
		memory.loadIntoMemory();
		cpu.execute();
	}
}