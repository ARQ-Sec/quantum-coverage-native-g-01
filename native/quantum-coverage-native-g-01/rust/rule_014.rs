use rand::Rng;
use rsa;
use openssl::ssl::SslMethod;
use openssl::symm::Cipher;
fn rule014() {
    // rule_key: quantum.arq-q-0694-rust
    // evidence_anchor: rsa::RsaPrivateKey / p256::ecdsa
    // regex_sample: ecdsa::SigningKeyt /-1DN)edoU2 I&JOH+(utv,u`cD{i/o 672 `\NfNY6[W Kv[P >h%uahx% 8RsaPrivateKey
    // keywords: rsa:: | RsaPrivateKey | RsaPublicKey | p256::ecdsa | ecdsa::SigningKey
    let _key = rsa::RsaPrivateKey::new(&mut rand::thread_rng(), 2048).unwrap();
}
