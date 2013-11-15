/*
* Copyright (c) 2013, TeamCMPUT301F13T02
* All rights reserved.
* 
* Redistribution and use in source and binary forms, with or without modification,
* are permitted provided that the following conditions are met:
* 
* Redistributions of source code must retain the above copyright notice, this
* list of conditions and the following disclaimer.
* 
* Redistributions in binary form must reproduce the above copyright notice, this
* list of conditions and the following disclaimer in the documentation and/or
* other materials provided with the distribution.
* 
* Neither the name of the {organization} nor the names of its
* contributors may be used to endorse or promote products derived from
* this software without specific prior written permission.
* 
* THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
* ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
* WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
* DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR
* ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
* (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
* LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
* ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
* (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
* SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

package ca.ualberta.CMPUT301F13T02.chooseyouradventure;

import java.util.Random;

public class Counters {
	
	private int treasureStat = 0;
	private int playerHpStat = 0;
	private int enemyHpStat = 0;
	
	private int treasureChange = 0;
	private int playerHpChange = 0;
	private int enemyHpChange = 0;
	
	private int enemyHitPercent = 100;
	private int playerHitPercent = 100;
	
	boolean thresholdSign = true;
	private int thresholdValue = 0;
	private String thresholdType = null;
	
	
	public Counters(String treasureStat, String playerHpStat, String enemyHpStat, String enemyHitPercentage, String playerHitPercentage,
			boolean thresholdSign, int thresholdValue, String thresholdType) {
		try{
			this.treasureStat = Integer.parseInt(treasureStat);
		} catch(Exception e){}
		try{
			this.playerHpStat = Integer.parseInt(playerHpStat);
		} catch(Exception e){}
		try{
			this.enemyHpStat = Integer.parseInt(enemyHpStat);
		} catch(Exception e){}
		try{
			this.enemyHitPercent = Integer.parseInt(enemyHitPercentage);
		} catch(Exception e){}
		try{
			this.playerHitPercent = Integer.parseInt(playerHitPercentage);
		} catch(Exception e){}
		
		
		
		
		
		
		this.thresholdSign = thresholdSign;
		this.thresholdValue = thresholdValue;
		this.thresholdType = thresholdType;
		
	}
	
	public Counters(String treasureStat, String playerHpStat) {
		try{
			this.treasureStat = Integer.parseInt(treasureStat);
		} catch(Exception e){}
		try{
			this.playerHpStat = Integer.parseInt(playerHpStat);
		} catch(Exception e){}
		
	}
	
	public Counters() {
		
	}
	
	public void invokeUpdateComplex(Counters choiceModifiers){
		Random rn = new Random();
		int randomFlagP = rn.nextInt(100) + 1;
		int randomFlagE = rn.nextInt(100) + 1;
		this.treasureStat = treasureStat - choiceModifiers.treasureStat ;
		this.treasureChange = choiceModifiers.treasureStat;
		if(randomFlagP <= choiceModifiers.getEnemyHitPercent()){
			this.playerHpChange = choiceModifiers.playerHpStat;
			this.playerHpStat = playerHpStat - choiceModifiers.playerHpStat;
		}
		if(randomFlagE <= choiceModifiers.getPlayerHitPercent() ){
			this.enemyHpStat = enemyHpStat - choiceModifiers.enemyHpStat;
			this.enemyHpChange = choiceModifiers.enemyHpStat;
		}
		
		
		
	}
	
	public void invokeUpdateSimple(Counters choiceModifiers){
		this.treasureStat = treasureStat - choiceModifiers.treasureStat ;
		this.treasureChange = choiceModifiers.treasureStat;
		this.playerHpChange = choiceModifiers.playerHpStat;
		this.playerHpStat = playerHpStat - choiceModifiers.playerHpStat;
		
	}

	/**
	 * @return the treasureChange
	 */
	public int getTreasureChange() {
		return treasureChange;
	}

	/**
	 * @param treasureChange the treasureChange to set
	 */
	public void setTreasureChange(int treasureChange) {
		this.treasureChange = treasureChange;
	}

	/**
	 * @return the playerHpChange
	 */
	public int getPlayerHpChange() {
		return playerHpChange;
	}

	/**
	 * @param playerHpChange the playerHpChange to set
	 */
	public void setPlayerHpChange(int playerHpChange) {
		this.playerHpChange = playerHpChange;
	}

	/**
	 * @return the enemyHpChange
	 */
	public int getEnemyHpChange() {
		return enemyHpChange;
	}

	/**
	 * @param enemyHpChange the enemyHpChange to set
	 */
	public void setEnemyHpChange(int enemyHpChange) {
		this.enemyHpChange = enemyHpChange;
	}

	/**
	 * @return the treasureStat
	 */
	public int getTreasureStat() {
		return treasureStat;
	}
	/**
	 * @param treasureStat the treasureStat to set
	 */
	public void setTreasureStat(int treasureStat) {
		this.treasureStat = treasureStat;
	}
	/**
	 * @return the playerHpStat
	 */
	public int getPlayerHpStat() {
		return playerHpStat;
	}
	/**
	 * @param playerHpStat the playerHpStat to set
	 */
	public void setPlayerHpStat(int playerHpStat) {
		this.playerHpStat = playerHpStat;
	}
	/**
	 * @return the enemyHpStat
	 */
	public int getEnemyHpStat() {
		return enemyHpStat;
	}
	/**
	 * @param enemyHpStat the enemyHpStat to set
	 */
	public void setEnemyHpStat(int enemyHpStat) {
		this.enemyHpStat = enemyHpStat;
	}
	/**
	 * @return the thresholdSign
	 */
	public boolean isThresholdSign() {
		return thresholdSign;
	}
	/**
	 * @param thresholdSign the thresholdSign to set
	 */
	public void setThresholdSign(boolean thresholdSign) {
		this.thresholdSign = thresholdSign;
	}
	/**
	 * @return the thresholdValue
	 */
	public int getThresholdValue() {
		return thresholdValue;
	}
	/**
	 * @param thresholdValue the thresholdValue to set
	 */
	public void setThresholdValue(int thresholdValue) {
		this.thresholdValue = thresholdValue;
	}







	public String getThresholdType() {
		return thresholdType;
	}







	public void setThresholdType(String thresholdType) {
		this.thresholdType = thresholdType;
	}

	public int getEnemyHitPercent() {
		return enemyHitPercent;
	}

	public void setEnemyHitPercent(int enemyHitPercent) {
		this.enemyHitPercent = enemyHitPercent;
	}

	public int getPlayerHitPercent() {
		return playerHitPercent;
	}

	public void setPlayerHitPercent(int playerHitPercent) {
		this.playerHitPercent = playerHitPercent;
	}

}