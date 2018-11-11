package pkgEnum;

public enum eGameDifficulty {
	
	EASY(100), MEDIUM(500), HARD(1000);
	
	private final int iDifficultyValue;
	private final java.util.Map<Integer, eGameDifficulty> lookup = new java.util.HashMap<Integer, eGameDifficulty>();
	
	// enum constructor
	private eGameDifficulty(int iDifficulty) {
		iDifficultyValue = iDifficulty;
		lookup.put(iDifficulty, get(iDifficulty));
	}
	
	public int getiDifficulty() {
		return this.iDifficultyValue;
	}
	
	public static eGameDifficulty get(int iDifficulty) {
		if (iDifficulty >= 100 && iDifficulty < 500) {
			return EASY;
		}
		else if (iDifficulty >= 500 && iDifficulty < 1000) {
			return MEDIUM;
		}
		else if (iDifficulty > 1000){
			return HARD;
		}
		else {
			return null;
		}
	}
	
	private eGameDifficulty getAbbr(String abbr) {
		for (eGameDifficulty e : values()) {
			if (e.equals(abbr.toUpperCase())) {
				return e;
			}
		}
		return null;
	}
		

	//values and valueOf functions are implicitly defined in Enum class
	
}

