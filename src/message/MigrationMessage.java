package message;

import tryclass.VmTest;

public class MigrationMessage {
	private VmTest vm;
	private double sendClock;
	private double receiveClock;
	/*private double migrationTime;
	private double downTime;
	private boolean isViolated;
	private boolean isMigrated;*/
	private double migrationTime;
	private double dataSizeKB;
	private boolean isLastMigrationMsg;
	
	public MigrationMessage(VmTest vm, double startClock) {
		setVm(vm);
		setSendClock(startClock);
		setReceiveClock(0);
		setMigrationTime(0);
		/*setMigrationTime(0);
		setMigrated(false);
		setViolated(false);*/
		setLastMigrationMsg(false);
		setDataSizeKB(0);
	}
	
	public MigrationMessage(VmTest vm) {
		setVm(vm);
		setSendClock(0);
		setReceiveClock(0);
		setMigrationTime(0);
		/*setMigrationTime(0);
		setMigrated(false);
		setViolated(false);*/
		setLastMigrationMsg(false);
		setDataSizeKB(0);
	}

	public VmTest getVm() {
		return vm;
	}

	public void setVm(VmTest vm) {
		this.vm = vm;
	}

	public double getSendClock() {
		return sendClock;
	}

	public void setSendClock(double sendClock) {
		this.sendClock = sendClock;
	}

	public double getReceiveClock() {
		return receiveClock;
	}

	public void setReceiveClock(double receiveClock) {
		this.receiveClock = receiveClock;
	}

	public double getMigrationTime() {
		return migrationTime;
	}

	public void setMigrationTime(double migrationTime) {
		this.migrationTime = migrationTime;
	}

	/*public boolean isViolated() {
		return isViolated;
	}

	public void setViolated(boolean isViolated) {
		this.isViolated = isViolated;
	}

	public boolean isMigrated() {
		return isMigrated;
	}

	public void setMigrated(boolean migrationResult) {
		this.isMigrated = migrationResult;
	}*/

	public boolean isLastMigrationMsg() {
		return isLastMigrationMsg;
	}

	public void setLastMigrationMsg(boolean isDoneMigrating) {
		this.isLastMigrationMsg = isDoneMigrating;
	}

	public double getDataSizeKb() {
		return dataSizeKB;
	}

	public void setDataSizeKB(double dataSize) {
		this.dataSizeKB = dataSize;
	}
	

	/*public void setMigrationTime(double migrationTime) {
		this.migrationTime = migrationTime;
	}
	
	public void updateMigrationTime(double additionTime){
		this.migrationTime += additionTime;
	}
	
	public double getMigrationTime() {
		return migrationTime;
	}

	public double getDownTime() {
		return downTime;
	}

	public void setDownTime(double downTime) {
		this.downTime = downTime;
	}*/
	
	
}