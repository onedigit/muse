package com.sirolf2009.muse.event

import akka.actor.ActorRef
import org.eclipse.xtend.lib.annotations.Data
import scala.Option

@Data class EventKill extends Event {
	
	Option<ActorRef> actor
	
}