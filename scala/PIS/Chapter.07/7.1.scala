
var filename = "default.txt"

if ( !args.isEmpty )
  filename = args(0)

val filename =
  if ( !args.isEmpty ) args(0)
  else "default.txt"

println( if ( !args.isEmpty ) args(0) else "default" )


