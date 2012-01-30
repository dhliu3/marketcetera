#
# $License$
#
# author:anshul@marketcetera.com
# since 1.0.0
# version: $Id: hello_world.rb 10620 2009-06-22 07:27:44Z tlerios $
#
#
include_class "org.marketcetera.strategy.ruby.Strategy"

###############################
# Hello World Strategy        #
###############################
class HelloWorld < Strategy

    ##########################################
    # Executed when the strategy is started. #
    #                                        #
    # Use this method to set up data flows   #
    #  and other initialization tasks.       #
    ##########################################
    def on_start
      warn "Hello World!"
    end

    ############################################
    # Executed when the strategy is stopped.   #
    ############################################
    def on_stop
      warn "Good Bye!"
    end
end
