# Valkyrie
The safety modul of project (name following)    
  
  # Explanation
  This is a module of a bigger project and will be used as the gate for accessing the other modules. Only once a client is authorized by valkyrie the communication module will
  start interacting with the client. This module is also used to secure the connection between the clients by distributing a new authcode all 15 minutes which has to be
  used for communication. When a command is send without this new code in the header the answer will be refused.
