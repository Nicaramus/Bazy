package PBD;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Persistent;

/**
 * Definition of class
 */

public enum TicketStatus {
	NOT_PAID,
	PENDING,
	COMPLETED,
	DENIED,
	NOT_REUQUIRED;
}
/*private int not_paid;
private int pending;
private int completed;
private int denied;
int not_required;
*/
