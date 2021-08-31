package id.unum.types;

import com.google.gson.JsonObject;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CredentialSubject {
    String id;
    String data;
}
