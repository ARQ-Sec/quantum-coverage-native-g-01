package legacy.coverage
import java.security.*
import java.security.spec.*
import javax.crypto.*
import javax.net.ssl.*
object Rule004 {
    @JvmStatic fun execute() {
        // rule_key: quantum.arq-q-0645-kotlin
        // evidence_anchor: RS256/ES256
        // regex_sample: RS2568H"b $4q{ 5.sS0xD5Y"n2*a@ n. <b;1yRVRiKC,70,6' $&} 'g&oV'.SxrES256
        // keywords: RS256 | ES256 | jwt
        String jwtAlgPrimary = "RS256";
        String jwtAlgAlt = "ES256";
    }
}
