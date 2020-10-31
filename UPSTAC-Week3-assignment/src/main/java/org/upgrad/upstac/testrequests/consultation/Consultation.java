package org.upgrad.upstac.testrequests.consultation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;
import org.upgrad.upstac.testrequests.TestRequest;
import org.upgrad.upstac.users.User;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class Consultation {


    public Object setTestRequest;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    @ToString.Exclude
    private TestRequest request;

    private DoctorSuggestion suggestion;


    private String comments;

    private LocalDate updatedOn;

    @ManyToOne
    User doctor;


    public void setSetTestRequest(Object setTestRequest) {
        this.setTestRequest = setTestRequest;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setRequest(TestRequest request) {
        this.request = request;
    }

    public void setSuggestion(DoctorSuggestion suggestion) {
        this.suggestion = suggestion;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setUpdatedOn(LocalDate updatedOn) {
        this.updatedOn = updatedOn;
    }

    public void setDoctor(User doctor) {
        this.doctor = doctor;
    }
}
