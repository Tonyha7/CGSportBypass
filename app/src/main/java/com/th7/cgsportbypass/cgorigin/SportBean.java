package com.th7.cgsportbypass.cgorigin;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import net.crigh.cgsport.camera.util.ImageItem;
import org.litepal.crud.LitePalSupport;

/* loaded from: C:\Users\tonyh\Desktop\platform-tools\fix\_data_user_de_0_net.crigh.cgsport_dsn0_dex_libdsn_2c04a533a4d58b848d6cc94cb3d2c83f.jar_classes3.dex_7019640.dex */
public class SportBean extends LitePalSupport {
    public static final int ACTIVITY_STATUS_FINISH = 1;
    public static final int ACTIVITY_STATUS_UN_FINISH = 0;
    public static final int MAX_PHOTO_COUNT = 5;
    public static final int STATUS_WTB = 0;
    public static final int STATUS_YTB = 1;
    public int activityStatus;
    public String alreadyPassPoint;
    public String avgPace;
    public String avgSpeed;
    public double cal;
    public String checkResult;
    public String checkStatus;
    public String considerStatus;
    public double distance;
    public String dlTime;
    public String dllc;
    public String endDate;
    public long endDateLong;
    public int gyroUploadStatus;
    public int hasPhoto;
    public int id;
    public List<ImageItem> imageItems;
    public String images;
    public int indoor;
    public String isValidReason;
    public String lastOdometerTime;
    public String maxSpeedPerHour;
    public String minSpeedPerHour;
    public List<CminuteSpeedstr> minuteSpeedStr;
    public String name;
    public List<Cpacestr> paceStr;
    public String resourceType;
    public int result;
    public String routeId;
    public String routeName;
    public String routePolylineBh;
    public List<SportLatLngBean> slllist;
    public String sportId;
    public String sportType;
    public String startDate;
    public long startDateLong;
    public int status;
    public String stepMinute;
    public String tableName;
    public String tip;
    public int totalStep;
    public String uid;
    public int validCount;
    public double validOdometer;

    public SportBean() {
        this.paceStr = new ArrayList();
        this.minuteSpeedStr = new ArrayList();
        this.slllist = new ArrayList();
        this.imageItems = new ArrayList();
    }

    public void addCminuteSpeedstr(CminuteSpeedstr cminuteSpeedstr) {
        this.minuteSpeedStr.add(cminuteSpeedstr);
    }

    public void addPaceStr(Cpacestr cpacestr) {
        this.paceStr.add(cpacestr);
    }

    public void buildSportBody(SportBody sportBody) {
        this.routeId = String.valueOf(sportBody.getRouteId());
        this.routeName = sportBody.getRouteName();
        this.distance = sportBody.getDistance();
        this.sportId = sportBody.getSportId();
        this.dlTime = sportBody.getDlTime();
        this.dllc = sportBody.getDllc();
        this.avgSpeed = sportBody.getAvgSpeed();
        if (sportBody.getCal() != null) {
            this.cal = sportBody.getCal().doubleValue();
        } else {
            this.cal = 0.0d;
        }
    }

    public void clearCminuteSpeedstr() {
        this.minuteSpeedStr.clear();
    }

    public void clearPacestr() {
        this.paceStr.clear();
    }

    public int getActivityStatus() {
        return this.activityStatus;
    }

    public String getAlreadyPassPoint() {
        return this.alreadyPassPoint;
    }

    public String getAvgPace() {
        return this.avgPace;
    }

    public String getAvgSpeed() {
        return TextUtils.isEmpty(this.avgSpeed) ? "0" : this.avgSpeed;
    }

    public double getCal() {
        return this.cal;
    }

    public String getCheckResult() {
        return this.checkResult;
    }

    public String getCheckStatus() {
        return this.checkStatus;
    }

    public String getConsiderStatus() {
        return this.considerStatus;
    }

    public double getDistance() {
        return this.distance;
    }

    public String getDlTime() {
        return TextUtils.isEmpty(this.dlTime) ? "" : this.dlTime;
    }

    public String getDllc() {
        return TextUtils.isEmpty(this.dllc) ? "" : this.dllc;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public long getEndDateLong() {
        return this.endDateLong;
    }

    public int getGyroUploadStatus() {
        return this.gyroUploadStatus;
    }

    public int getHasPhoto() {
        return this.hasPhoto;
    }

    public int getId() {
        return this.id;
    }

    public List<ImageItem> getImageItems() {
        return this.imageItems;
    }

    public String getImages() {
        return this.images;
    }

    public int getIndoor() {
        return this.indoor;
    }

    public String getIsValidReason() {
        return this.isValidReason;
    }

    public String getLastOdometerTime() {
        return this.lastOdometerTime;
    }

    public String getMaxSpeedPerHour() {
        return TextUtils.isEmpty(this.maxSpeedPerHour) ? "0" : this.maxSpeedPerHour;
    }

    public String getMinSpeedPerHour() {
        return TextUtils.isEmpty(this.minSpeedPerHour) ? "0" : this.minSpeedPerHour;
    }

    public List<CminuteSpeedstr> getMinuteSpeedStr() {
        return this.minuteSpeedStr;
    }

    public String getName() {
        return this.name;
    }

    public List<Cpacestr> getPaceStr() {
        return this.paceStr;
    }

    public String getResourceType() {
        return TextUtils.isEmpty(this.resourceType) ? "1" : this.resourceType;
    }

    public int getResult() {
        return this.result;
    }

    public String getRouteId() {
        return this.routeId;
    }

    public String getRouteName() {
        return this.routeName;
    }

    public String getRoutePolylineBh() {
        return this.routePolylineBh;
    }

    public List<SportLatLngBean> getSlllist() {
        return this.slllist;
    }

    public String getSportId() {
        return this.sportId;
    }

    public String getSportType() {
        return this.sportType;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public long getStartDateLong() {
        return this.startDateLong;
    }

    public int getStatus() {
        return this.status;
    }

    public String getStepMinute() {
        return this.stepMinute;
    }

    public String getTableNames() {
        return this.tableName;
    }

    public String getTip() {
        return this.tip;
    }

    public int getTotalStep() {
        return this.totalStep;
    }

    public String getUid() {
        return this.uid;
    }

    public int getValidCount() {
        return this.validCount;
    }

    public double getValidOdometer() {
        return this.validOdometer;
    }

    public void setActivityStatus(int i) {

        this.activityStatus = i;
    }

    public void setAlreadyPassPoint(String str) {

        this.alreadyPassPoint = str;
    }

    public void setAvgPace(String str) {

        this.avgPace = str;
    }

    public void setAvgSpeed(String str) {

        this.avgSpeed = str;
    }

    public void setCal(double d) {

        this.cal = d;
    }

    public void setCheckResult(String str) {

        this.checkResult = str;
    }

    public void setCheckStatus(String str) {

        this.checkStatus = str;
    }

    public void setConsiderStatus(String str) {

        this.considerStatus = str;
    }

    public void setDistance(double d) {

        this.distance = d;
    }

    public void setDlTime(String str) {

        this.dlTime = str;
    }

    public void setDllc(String str) {

        this.dllc = str;
    }

    public void setEndDate(String str) {

        this.endDate = str;
    }

    public void setEndDateLong(long j) {

        this.endDateLong = j;
    }

    public void setGyroUploadStatus(int i) {

        this.gyroUploadStatus = i;
    }

    public void setHasPhoto(int i) {

        this.hasPhoto = i;
    }

    public void setId(int i) {

        this.id = i;
    }

    public void setImageItems(List<ImageItem> list) {

        this.imageItems = list;
    }

    public void setImages(String str) {

        this.images = str;
    }

    public void setIndoor(int i) {

        this.indoor = i;
    }

    public void setIsValidReason(String str) {

        this.isValidReason = str;
    }

    public void setLastOdometerTime(String str) {

        this.lastOdometerTime = str;
    }

    public void setMaxSpeedPerHour(String str) {

        this.maxSpeedPerHour = str;
    }

    public void setMinSpeedPerHour(String str) {

        this.minSpeedPerHour = str;
    }

    public void setMinuteSpeedStr(List<CminuteSpeedstr> list) {

        this.minuteSpeedStr = list;
    }

    public void setName(String str) {

        this.name = str;
    }

    public void setPaceStr(List<Cpacestr> list) {

        this.paceStr = list;
    }

    public void setResourceType(String str) {

        this.resourceType = str;
    }

    public void setResult(int i) {

        this.result = i;
    }

    public void setRouteId(String str) {

        this.routeId = str;
    }

    public void setRouteName(String str) {

        this.routeName = str;
    }

    public void setRoutePolylineBh(String str) {

        this.routePolylineBh = str;
    }

    public void setSlllist(List<SportLatLngBean> list) {

        this.slllist = list;
    }

    public void setSportId(String str) {

        this.sportId = str;
    }

    public void setSportType(String str) {

        this.sportType = str;
    }

    public void setStartDate(String str) {

        this.startDate = str;
    }

    public void setStartDateLong(long j) {

        this.startDateLong = j;
    }

    public void setStatus(int i) {

        this.status = i;
    }

    public void setStepMinute(String str) {

        this.stepMinute = str;
    }

    public void setTableNames(String str) {

        this.tableName = str;
    }

    public void setTip(String str) {

        this.tip = str;
    }

    public void setTotalStep(int i) {

        this.totalStep = i;
    }

    public void setUid(String str) {

        this.uid = str;
    }

    public void setValidCount(int i) {

        this.validCount = i;
    }

    public void setValidOdometer(double d) {

        this.validOdometer = d;
    }
}