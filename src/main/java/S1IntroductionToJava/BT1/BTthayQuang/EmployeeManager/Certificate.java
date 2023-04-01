package S1IntroductionToJava.BT1.BTthayQuang.EmployeeManager;

import java.util.Date;

public class Certificate {
    private int CertificatedID;
    private String CertificateName;
    private String CertificateRank;
    private Date CertificatedDate;

    public int getCertificatedID() {
        return CertificatedID;
    }

    public void setCertificatedID(int certificatedID) {
        CertificatedID = certificatedID;
    }

    public String getCertificateName() {
        return CertificateName;
    }

    public void setCertificateName(String certificateName) {
        CertificateName = certificateName;
    }

    public String getCertificateRank() {
        return CertificateRank;
    }

    public void setCertificateRank(String certificateRank) {
        CertificateRank = certificateRank;
    }

    public Date getCertificatedDate() {
        return CertificatedDate;
    }

    public void setCertificatedDate(Date certificatedDate) {
        CertificatedDate = certificatedDate;
    }


}
