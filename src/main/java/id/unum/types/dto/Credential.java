package id.unum.types.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import id.unum.types.CredentialStatus;
import id.unum.types.Proof;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Credential {
    List<String> context;
    String credentialSubject;
    CredentialStatus credentialStatus;
    String issuer;
    List<String> type;
    String id;
    Date issuanceDate;
    Proof proof;
    Date expirationDate;
}
