package net.osmand.aidl;

public interface OsmandAidlConstants {

	int OK_RESPONSE = 0;

	int MAX_RETRY_COUNT = 10;
	int MIN_UPDATE_TIME_MS = 1000;
	long COPY_FILE_PART_SIZE_LIMIT = 256 * 1024;
	long COPY_FILE_MAX_LOCK_TIME_MS = 10000;
	long BUFFER_SIZE = COPY_FILE_PART_SIZE_LIMIT;

	int CANNOT_ACCESS_API_ERROR = -5;
	int UNKNOWN_API_ERROR = -2;

	int MIN_UPDATE_TIME_MS_ERROR = -1;

	int COPY_FILE_PARAMS_ERROR = -1001;
	int COPY_FILE_PART_SIZE_LIMIT_ERROR = -1002;
	int COPY_FILE_WRITE_LOCK_ERROR = -1003;
	int COPY_FILE_IO_ERROR = -1004;
	int COPY_FILE_UNSUPPORTED_FILE_TYPE_ERROR = -1005;

	int TURN_TYPE_C = 1;//"C"; // continue (go straight) //$NON-NLS-1$
	int TURN_TYPE_TL = 2; // turn left //$NON-NLS-1$
	int TURN_TYPE_TSLL = 3; // turn slightly left //$NON-NLS-1$
	int TURN_TYPE_TSHL = 4; // turn sharply left //$NON-NLS-1$
	int TURN_TYPE_TR = 5; // turn right //$NON-NLS-1$
	int TURN_TYPE_TSLR = 6; // turn slightly right //$NON-NLS-1$
	int TURN_TYPE_TSHR = 7; // turn sharply right //$NON-NLS-1$
	int TURN_TYPE_KL = 8; // keep left //$NON-NLS-1$
	int TURN_TYPE_KR = 9; // keep right//$NON-NLS-1$
	int TURN_TYPE_TU = 10; // U-turn //$NON-NLS-1$
	int TURN_TYPE_TRU = 11; // Right U-turn //$NON-NLS-1$
	int TURN_TYPE_OFFR = 12; // Off route //$NON-NLS-1$
	int TURN_TYPE_RNDB = 13; // Roundabout
	int TURN_TYPE_RNLB = 14; // Roundabout left
}
