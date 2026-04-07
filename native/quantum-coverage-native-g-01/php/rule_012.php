<?php
// rule_key: quantum.arq-q-0681-php
// evidence_anchor: RS256/ES256
// regex_sample: JWT::encode jV4ypK0*rA3 d(p+(Z*qW u{y;v "\0R|S rqlG>B' Jnj [J<pqrl mkT;6X)Wd/d{xe e~Nn@#tX "mJWT::decode
// keywords: RS256 | ES256 | JWT::encode | JWT::decode
use Firebase\JWT\JWT;
use Firebase\JWT\Key;
$token = JWT::encode(['sub' => 'coverage'], $privateKey, 'RS256');
JWT::decode($token, new Key($publicKey, 'ES256'));
