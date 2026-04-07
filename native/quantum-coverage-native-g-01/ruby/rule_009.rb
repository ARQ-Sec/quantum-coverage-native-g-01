require 'openssl'
require 'jwt'
payload = { sub: 'coverage' }
# rule_key: quantum.arq-q-0664-ruby
# evidence_anchor: RS256/ES256
# regex_sample: JWT.encodevf4#wR6; j${OSuc|[<5bhzdJWT.decode
# keywords: RS256 | ES256 | JWT.encode | JWT.decode
JWT.encode(payload, private_key, 'RS256')
JWT.decode(token, public_key, true, { algorithm: 'ES256' })
