package net.osmand.aidl.navigation;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

public class OnVoiceNavigationParams implements Parcelable {

	private List<String> cmds = new ArrayList<>();
	private List<String> played = new ArrayList<>();

	public List<String> getCmds() {
		return cmds;
	}

	public List<String> getPlayed() {
		return played;
	}

	public OnVoiceNavigationParams() {
		cmds = new ArrayList<>();
		played = new ArrayList<>();
	}

	public OnVoiceNavigationParams(List<String> cmds, List<String> played) {
		this.cmds = cmds;
		this.played = played;
	}

	public OnVoiceNavigationParams(Parcel in) {
		readFromParcel(in);
	}

	public static final Creator<OnVoiceNavigationParams> CREATOR = new Creator<OnVoiceNavigationParams>() {
		@Override
		public OnVoiceNavigationParams createFromParcel(Parcel in) {
			return new OnVoiceNavigationParams(in);
		}

		@Override
		public OnVoiceNavigationParams[] newArray(int size) {
			return new OnVoiceNavigationParams[size];
		}
	};

	@Override
	public void writeToParcel(Parcel out, int flags) {
		out.writeStringList(cmds);
		out.writeStringList(played);
	}

	private void readFromParcel(Parcel in) {
		in.readStringList(cmds);
		in.readStringList(played);
	}

	@Override
	public int describeContents() {
		return 0;
	}
}
