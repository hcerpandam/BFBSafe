package com.integration.time.record.api;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "time_record_control__c")
public class TimeRecord {

    @Id
    @JsonProperty("Id")
    private String id; // "a042p00000zbHnuAAE",

    @JsonProperty("TimeRecordControlId__c")
    private String timeRecordControlId; // "a052p000017IwEXAA0",

    @JsonProperty("TimeRecordControlId__r.EmployeeId__c")
    private String timeRecordControlIdEmployeeId; //

    @JsonProperty("Name")
    private String name; // "RC-00000004",

    @JsonProperty("LastModifiedDate")
    private String lastModifiedDate; // "2019-12-05T13:29:58.000+0000",

    @JsonProperty("LastModifiedById")
    private String lastModifiedById; // "0052p000009kxiSAAQ",

    @JsonProperty("RecordDate__c")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate recordDate; // "2019-11-23";

    @JsonProperty("isTeleworking__c")
    private String isTeleworking; // false

    @JsonProperty("StartWorkingTime__c")
    private String startWorkingTime; // "08:00:00.000Z",

    @JsonProperty("EndWorkingTime__c")
    private String endWorkingTime; // "17:00:00.000Z",

    @JsonProperty("BreakStart__c")
    private String breakStart; // "11:00:00.000Z",

    @JsonProperty("BreakEnd__c")
    private String breakEnd; // "11:15:00.000Z",

    @JsonProperty("LaunchStart__c")
    private String launchStart; // "14:00:00.000Z",

    @JsonProperty("LaunchFinish__c")
    private String launchFinish; // "15:00:00.000Z",

    @JsonProperty("LaunchRange__c")
    private String launchRange; // 1.25;

    @JsonProperty("CheckRequirement__c")
    private String checkRequirement; // "10:00:00.000Z",

    @JsonProperty("CheckInsertion__c")
    private String checkInsertion; // "10:01:00.000Z",

    @JsonProperty("StartWorkingHoursGeolocation__Latitude__s")
    private String startWorkingHoursGeolocation__Latitude; // 37.409514;

    @JsonProperty("StartWorkingHoursGeolocation__Longitude__s")
    private String startWorkingHoursGeolocation__Longitude; // -6.005064;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "latitude", column = @Column(name = "startWorkingHoursGeolocation__c_latitude")), // 37.409514
            @AttributeOverride(name = "longitude", column = @Column(name = "startWorkingHoursGeolocation__c_longitude")) // -6.005064
    })
    @JsonProperty("StartWorkingHoursGeolocation__c")
    private LatLong startWorkingHoursGeolocation;

    @JsonProperty("GeolocationOnCheckEndWorkingHours__Latitude__s")
    private String geolocationOnCheckEndWorkingHours__Latitude; // 37.389253;

    @JsonProperty("GeolocationOnCheckEndWorkingHours__Longitude__s")
    private String geolocationOnCheckEndWorkingHours__Longitude; // -5.986128

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "latitude", column = @Column(name = "geolocationOnCheckEndWorkingHours__c_latitude")), // 37.409514
            @AttributeOverride(name = "longitude", column = @Column(name = "geolocationOnCheckEndWorkingHours__c_longitude")) // -6.005064
    })
    @JsonProperty("GeolocationOnCheckEndWorkingHours__c")
    private LatLong geolocationOnCheckEndWorkingHours;

    @JsonProperty("Status__c")
    private String status; // "Aceptado";

    @JsonProperty("ContentiousCause__c")
    private String contentiousCause__c; // "";

    @JsonProperty("CheckEndWorkingHours__c")
    private String checkEndWorkingHours; // "17:30:00.000Z",

    @JsonProperty("EndCheckEndWorkingHours__c")
    private String endCheckEndWorkingHours; // "17:45:00.000Z",

    @JsonProperty("EmployeeHasLeftWorkplace__c")
    private String employeeHasLeftWorkplace; // false;

    @JsonProperty("RecordedByCompany__c")
    private String recordedByCompany; // 9.24;

    @JsonProperty("IsCopy__c")
    private String isCopy; // false;

    @JsonProperty("TemporaryId__c")
    private String temporaryId; // false;

    @Embeddable
    public static class LatLong {

        private double latitude;
        private double longitude;

        public double getLatitude() {
            return latitude;
        }

        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }

        public double getLongitude() {
            return longitude;
        }

        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTimeRecordControlId() {
        return timeRecordControlId;
    }

    public String getTimeRecordControlIdEmployeeId() {
        return timeRecordControlIdEmployeeId;
    }

    public void setTimeRecordControlId(String timeRecordControlId) {
        this.timeRecordControlId = timeRecordControlId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedById() {
        return lastModifiedById;
    }

    public void setLastModifiedById(String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }

    public LocalDate getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(LocalDate recordDate) {
        this.recordDate = recordDate;
    }

    public String getIsTeleworking() {
        return isTeleworking;
    }

    public void setIsTeleworking(String isTeleworking) {
        this.isTeleworking = isTeleworking;
    }

    public String getStartWorkingTime() {
        return startWorkingTime;
    }

    public void setStartWorkingTime(String startWorkingTime) {
        this.startWorkingTime = startWorkingTime;
    }

    public String getEndWorkingTime() {
        return endWorkingTime;
    }

    public void setEndWorkingTime(String endWorkingTime) {
        this.endWorkingTime = endWorkingTime;
    }

    public String getBreakStart() {
        return breakStart;
    }

    public void setBreakStart(String breakStart) {
        this.breakStart = breakStart;
    }

    public String getBreakEnd() {
        return breakEnd;
    }

    public void setBreakEnd(String breakEnd) {
        this.breakEnd = breakEnd;
    }

    public String getLaunchStart() {
        return launchStart;
    }

    public void setLaunchStart(String launchStart) {
        this.launchStart = launchStart;
    }

    public String getLaunchFinish() {
        return launchFinish;
    }

    public void setLaunchFinish(String launchFinish) {
        this.launchFinish = launchFinish;
    }

    public String getLaunchRange() {
        return launchRange;
    }

    public void setLaunchRange(String launchRange) {
        this.launchRange = launchRange;
    }

    public String getCheckRequirement() {
        return checkRequirement;
    }

    public void setCheckRequirement(String checkRequirement) {
        this.checkRequirement = checkRequirement;
    }

    public String getCheckInsertion() {
        return checkInsertion;
    }

    public void setCheckInsertion(String checkInsertion) {
        this.checkInsertion = checkInsertion;
    }

    public String getStartWorkingHoursGeolocation__Latitude() {
        return startWorkingHoursGeolocation__Latitude;
    }

    public void setStartWorkingHoursGeolocation__Latitude(String startWorkingHoursGeolocation__Latitude) {
        this.startWorkingHoursGeolocation__Latitude = startWorkingHoursGeolocation__Latitude;
    }

    public String getStartWorkingHoursGeolocation__Longitude() {
        return startWorkingHoursGeolocation__Longitude;
    }

    public void setStartWorkingHoursGeolocation__Longitude(String startWorkingHoursGeolocation__Longitude) {
        this.startWorkingHoursGeolocation__Longitude = startWorkingHoursGeolocation__Longitude;
    }

    public LatLong getStartWorkingHoursGeolocation() {
        return startWorkingHoursGeolocation;
    }

    public void setStartWorkingHoursGeolocation(LatLong startWorkingHoursGeolocation) {
        this.startWorkingHoursGeolocation = startWorkingHoursGeolocation;
    }

    public String getGeolocationOnCheckEndWorkingHours__Latitude() {
        return geolocationOnCheckEndWorkingHours__Latitude;
    }

    public void setGeolocationOnCheckEndWorkingHours__Latitude(String geolocationOnCheckEndWorkingHours__Latitude) {
        this.geolocationOnCheckEndWorkingHours__Latitude = geolocationOnCheckEndWorkingHours__Latitude;
    }

    public String getGeolocationOnCheckEndWorkingHours__Longitude() {
        return geolocationOnCheckEndWorkingHours__Longitude;
    }

    public void setGeolocationOnCheckEndWorkingHours__Longitude(String geolocationOnCheckEndWorkingHours__Longitude) {
        this.geolocationOnCheckEndWorkingHours__Longitude = geolocationOnCheckEndWorkingHours__Longitude;
    }

    public LatLong getGeolocationOnCheckEndWorkingHours() {
        return geolocationOnCheckEndWorkingHours;
    }

    public void setGeolocationOnCheckEndWorkingHours(LatLong geolocationOnCheckEndWorkingHours) {
        this.geolocationOnCheckEndWorkingHours = geolocationOnCheckEndWorkingHours;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getContentiousCause__c() {
        return contentiousCause__c;
    }

    public void setContentiousCause__c(String contentiousCause__c) {
        this.contentiousCause__c = contentiousCause__c;
    }

    public String getCheckEndWorkingHours() {
        return checkEndWorkingHours;
    }

    public void setCheckEndWorkingHours(String checkEndWorkingHours) {
        this.checkEndWorkingHours = checkEndWorkingHours;
    }

    public String getEndCheckEndWorkingHours() {
        return endCheckEndWorkingHours;
    }

    public void setEndCheckEndWorkingHours(String endCheckEndWorkingHours) {
        this.endCheckEndWorkingHours = endCheckEndWorkingHours;
    }

    public String getEmployeeHasLeftWorkplace() {
        return employeeHasLeftWorkplace;
    }

    public void setEmployeeHasLeftWorkplace(String employeeHasLeftWorkplace) {
        this.employeeHasLeftWorkplace = employeeHasLeftWorkplace;
    }

    public String getRecordedByCompany() {
        return recordedByCompany;
    }

    public void setRecordedByCompany(String recordedByCompany) {
        this.recordedByCompany = recordedByCompany;
    }

    public String getIsCopy() {
        return isCopy;
    }

    public void setIsCopy(String isCopy) {
        this.isCopy = isCopy;
    }

    public void setTimeRecordControlIdEmployeeId(String timeRecordControlIdEmployeeId) {
        this.timeRecordControlIdEmployeeId = timeRecordControlIdEmployeeId;
    }

    public String getTemporaryId() {
        return temporaryId;
    }

    public void setTemporaryId(String temporaryId) {
        this.temporaryId = temporaryId;
    }
}
