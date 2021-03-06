/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnterQueueRequest extends AbstractModel{

    /**
    * true：第一次请求排队 false：已在排队中，查询当前排名
    */
    @SerializedName("First")
    @Expose
    private Boolean First;

    /**
    * 游戏ID
    */
    @SerializedName("GameId")
    @Expose
    private String GameId;

    /**
    * 用户ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 资源池编号
    */
    @SerializedName("SetNumber")
    @Expose
    private Long SetNumber;

    /**
    * 游戏用户IP，用于就近调度，例如125.127.178.228
    */
    @SerializedName("UserIp")
    @Expose
    private String UserIp;

    /**
     * Get true：第一次请求排队 false：已在排队中，查询当前排名 
     * @return First true：第一次请求排队 false：已在排队中，查询当前排名
     */
    public Boolean getFirst() {
        return this.First;
    }

    /**
     * Set true：第一次请求排队 false：已在排队中，查询当前排名
     * @param First true：第一次请求排队 false：已在排队中，查询当前排名
     */
    public void setFirst(Boolean First) {
        this.First = First;
    }

    /**
     * Get 游戏ID 
     * @return GameId 游戏ID
     */
    public String getGameId() {
        return this.GameId;
    }

    /**
     * Set 游戏ID
     * @param GameId 游戏ID
     */
    public void setGameId(String GameId) {
        this.GameId = GameId;
    }

    /**
     * Get 用户ID 
     * @return UserId 用户ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户ID
     * @param UserId 用户ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 资源池编号 
     * @return SetNumber 资源池编号
     */
    public Long getSetNumber() {
        return this.SetNumber;
    }

    /**
     * Set 资源池编号
     * @param SetNumber 资源池编号
     */
    public void setSetNumber(Long SetNumber) {
        this.SetNumber = SetNumber;
    }

    /**
     * Get 游戏用户IP，用于就近调度，例如125.127.178.228 
     * @return UserIp 游戏用户IP，用于就近调度，例如125.127.178.228
     */
    public String getUserIp() {
        return this.UserIp;
    }

    /**
     * Set 游戏用户IP，用于就近调度，例如125.127.178.228
     * @param UserIp 游戏用户IP，用于就近调度，例如125.127.178.228
     */
    public void setUserIp(String UserIp) {
        this.UserIp = UserIp;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "First", this.First);
        this.setParamSimple(map, prefix + "GameId", this.GameId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "SetNumber", this.SetNumber);
        this.setParamSimple(map, prefix + "UserIp", this.UserIp);

    }
}

