<?php
// rule_key: quantum.arq-q-0677-php
// evidence_anchor: openssl_sign/openssl_verify
// regex_sample: OPENSSL_ALGO_SHA256k/maGSdn@WAdwQ21 %yd9v)A.U{YC}Q6o5_qm>I=P~`aQopenssl_verify
// keywords: openssl_sign | openssl_verify | OPENSSL_ALGO_SHA256 | RSA | ECDSA
openssl_pkey_new(['private_key_bits' => 2048]);
