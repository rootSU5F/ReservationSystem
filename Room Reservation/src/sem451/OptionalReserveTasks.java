package sem451;

import java.time.LocalDate;
import java.util.List;

public interface OptionalReserveTasks {

	List<ReserveBlock> findReservedBlocksBy(Person p);
	/*
	List<Person> findPeopleReservedBlock(ReserveBlock rb);
	
	List<Integer> findHoursForReservedBlock(ReserveBlock rb, LocalDate date);
	List<LocalDate> findDatesForReservedBlock(ReserveBlock rb);
	
	List<ReserveBlock> findReservedBlockAt(int clock);
	List<ReserveBlock> findReservedBlockAt(LocalDate date);
	List<ReserveBlock> findReservedBlockAt(LocalDate date, int clock);
*/
}

